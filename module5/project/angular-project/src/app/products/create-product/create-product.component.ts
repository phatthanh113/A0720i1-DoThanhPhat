import { ValidateService } from './../service/validate.service';
import { IProduct } from './../model/product';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from './../service/product.service';
import { Component, Inject, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ProductDetailComponent } from '../product-detail/product-detail.component';
let faker = require('faker');
@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.scss'],
  providers : [ValidateService]
})
export class CreateProductComponent implements OnInit {
  createForm! : FormGroup ;
  periodTime : FormGroup ;
  product : IProduct ;
  validation_messages = this.validateService.validationMessage_products;
  constructor(private validateService : ValidateService,
    private productService : ProductService ,
    private fb : FormBuilder ,
    private router: Router,
    public dialogRef: MatDialogRef<CreateProductComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.initForm();
  }
  initForm() {
    this.createForm = this.fb.group({
      id : [faker.random.number({max : 9999})],
      name : ['',Validators.compose([
        Validators.required
      ])],
      price : ['',Validators.compose([
        Validators.required
      ])],
      periodTime : this.fb.group({
        startDate : ['',Validators.compose([
          Validators.required,
          this.validateService.validateDate
        ])],
        endDate : ['',Validators.compose([
          Validators.required,
          this.validateService.validateDate
        ])],
      },{validators: this.validateService.checkPeriod})
    })
  }
  onSubmit() {
    if(this.createForm.valid) {
      this.router.navigateByUrl("/products")
    }
  }
  onCancel(): void {
    this.dialogRef.close();
  }
}
