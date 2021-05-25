import { IProduct } from './../model/product';
import { ProductService } from './../service/product.service';
import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss'],
})
export class ProductListComponent implements OnInit,OnChanges {
  products : IProduct[];
  search : String ='';
  constructor(private productService : ProductService,
    private activatedRoute : ActivatedRoute,
    private router : Router) { }
  ngOnChanges(changes: SimpleChanges): void {
  }
  ngOnInit(): void {
    // get param when reload url
    this.router.routeReuseStrategy.shouldReuseRoute = () => false ;
    this.search = this.activatedRoute.snapshot.queryParams["search"];
    this.initDataListProduct();
  }
  initDataListProduct() {
    if(!this.search) {
      this.products =this.productService.getAllProduct()
    } else{
      this.products=this.productService.getBySearch(this.search);
    }

  }
  handleDelete(id : number) {
    console.log(id);
    this.productService.deleteProduct(id);
  }
}
