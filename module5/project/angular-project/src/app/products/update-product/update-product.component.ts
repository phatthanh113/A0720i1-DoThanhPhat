import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from './../service/product.service';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

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
    private activatedRoute : ActivatedRoute) {}

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params["id"];
    this.initForm();
    this.updateForm.patchValue(this.productService.getById(this.id));
  }
  initForm() {
    this.updateForm = this.fb.group({
      id : [''],
      name : [''],
      price : [''],
    });
  }
  onSubmit() {
    this.productService.editProduct(this.updateForm.value);
    this.router.navigateByUrl("/products")
  }
}
