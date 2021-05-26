import { CreateProductComponent } from './../create-product/create-product.component';
import { ProductDetailComponent } from './../product-detail/product-detail.component';
import { IProduct } from './../model/product';
import { ProductService } from './../service/product.service';
import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmDeleteComponent } from '../confirm-delete/confirm-delete.component';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss'],
})
export class ProductListComponent implements OnInit,OnChanges {
  products : IProduct[];
  search : string ='';
  constructor(private productService : ProductService,
    private activatedRoute : ActivatedRoute,
    private router : Router,
    public dialog: MatDialog) { }
  ngOnChanges(changes: SimpleChanges): void {
  }
  ngOnInit(): void {
    // get param when reload url
    this.router.routeReuseStrategy.shouldReuseRoute = () => false ;
    this.search = this.activatedRoute.snapshot.queryParams["search"];
    this.initDataListProduct();
  }
  initDataListProduct() {
      this.products =this.productService.getAllProduct()
  }
  handleCreate() {
    const dialogRef = this.dialog.open(CreateProductComponent, {
      width : '350px' ,
      height : 'auto',
    });
    dialogRef.afterClosed().subscribe(result => {
      this.productService.createProduct(result.value);
    });
  }
  handleDelete(id : number) {
    const dialogRef = this.dialog.open(ConfirmDeleteComponent, {
      width : '300px' ,
      data: { product : this.productService.getById(id) }
    });
    dialogRef.afterClosed().subscribe(result =>  {
      if(result) {this.productService.deleteProduct(id)};
    });
  }
  handleView(id : number) {
    const dialogRef = this.dialog.open(ProductDetailComponent, {
      width : '350px' ,
      height : 'auto',
      data: { product : this.productService.getById(id) }
    });
    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
}
