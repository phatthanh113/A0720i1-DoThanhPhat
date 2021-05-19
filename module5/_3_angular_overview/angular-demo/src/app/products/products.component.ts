import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IProduct } from './model/product';

let product : IProduct ;
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  formCreateReactive : FormGroup ;
  product : IProduct ;
  constructor(private fb : FormBuilder) { }

  ngOnInit(): void {
    this.formCreateReactive = this.fb.group({
      id: ['',Validators.compose([
        Validators.required
      ])],
      name : ['',Validators.compose([
        Validators.required,
        Validators.pattern('')
      ])],
      price : [''],
      image : ['']
    })
    this.formCreateReactive.setValue(this.product);
  }
  onSubmit(){
    if(this.formCreateReactive.valid) {
      this.product = this.formCreateReactive.value ;

    }
  }
}
