import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from './../service/product.service';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.scss']
})
export class UpdateProductComponent implements OnInit {
  updateForm : FormGroup ;
  id : number = 0 ;
  constructor(private productService : ProductService ,
    private router : Router,
    private fb : FormBuilder,
    public dialogRef: MatDialogRef<UpdateProductComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {}

  ngOnInit(): void {
    this.initForm();
    this.updateForm.patchValue(this.data.product);
  }
  initForm() {
    this.updateForm = this.fb.group({
      id : [''],
      name : [''],
      price : [''],
    });
  };
  onSubmit() {
    if(this.updateForm.valid) {
      this.router.navigateByUrl("/products")
    }
  }
  onCancel() {
    this.dialogRef.close();
  }
}
