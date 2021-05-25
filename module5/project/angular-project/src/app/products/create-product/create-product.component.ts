import { IProduct } from './../model/product';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from './../service/product.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.scss'],
})
export class CreateProductComponent implements OnInit {
  createForm! : FormGroup ;
  product : IProduct ;
  validation_messages = {
    id : [
      {type : 'required',message : 'ID is required'},
    ],
    name : [
      {type : 'required',message : 'Name is required'},
    ]
  }
  constructor(private productService : ProductService , private fb : FormBuilder , private router: Router) { }

  ngOnInit(): void {
    this.initForm();
  }
  initForm() {
    this.createForm = this.fb.group({
      id : ['',Validators.compose([

      ])],
      name : ['',Validators.compose([
        Validators.required
      ])],
      price : [''],
    });
  }
  onSubmit() {
    if(this.createForm.valid) {
      this.productService.createProduct(this.createForm.value);
      console.log(this.productService.getAllProduct());
      this.router.navigateByUrl("/products")
    }
  }
}
