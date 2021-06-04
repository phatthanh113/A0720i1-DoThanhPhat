import { CreateProductComponent } from './../create-product/create-product.component';
import { ProductDetailComponent } from './../product-detail/product-detail.component';
import { IProduct } from './../model/product';
import { ProductService } from './../service/product.service';
import { Component, Input, OnChanges, OnInit, SimpleChanges, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmDeleteComponent } from '../confirm-delete/confirm-delete.component';
import { UpdateProductComponent } from '../update-product/update-product.component';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';
import { MatPaginator, PageEvent } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss'],
})
export class ProductListComponent implements OnInit,OnChanges {
  p: number = 1;
  products : IProduct[];
  product : IProduct ;
  search : string ='';
  length : number  ;
  pageSize = 3;
  pageSizeOptions: number[] = [5, 10, 25, 100];
  pageEvent: PageEvent;
  public dataSource: any;
  constructor(private productService : ProductService,
    private activatedRoute : ActivatedRoute,
    private router : Router,
    public dialog: MatDialog,

    iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) {
      iconRegistry.addSvgIcon(
        'thumbs-up',
        sanitizer.bypassSecurityTrustResourceUrl('assets/img/icon/thumbup-icon.svg'));
        iconRegistry.addSvgIcon(
          'delete',
          sanitizer.bypassSecurityTrustResourceUrl('assets/img/icon/delete-icon.svg'));
     }
  ngOnChanges(changes: SimpleChanges): void {
  }
  ngOnInit(): void {
    // get param when reload url
    this.router.routeReuseStrategy.shouldReuseRoute = () => false ;
    this.search = this.activatedRoute.snapshot.queryParams["search"];
    this.initDataListProduct();
  }

  //  get list product
  initDataListProduct() {
    this.productService.getAllProduct().subscribe((data: IProduct[])=>{
      this.products = data;
    });
  }
  // Add new
  handleCreate() {
    const dialogRef = this.dialog.open(CreateProductComponent, {
      width : '1000px' ,
      height : 'auto',
    });
    dialogRef.afterClosed().subscribe(result => {
      this.productService.createProduct(result.value).subscribe(next => {
        this.ngOnInit();
      },
      error => console.log(error));
    });
  }
  // Edit
  handleEdit(id : number) {
    let product : IProduct ;
    this.productService.getById(id).subscribe((next) => {
      product = next ;
      console.log(product);
      const dialogRef = this.dialog.open(UpdateProductComponent, {
        width : '300px' ,
        data: { product : product}
      });
      dialogRef.afterClosed().subscribe(result =>  {
        if(result) {
          this.productService.updateProduct(result.value).subscribe((next) => {
           this.ngOnInit();
          })
        };
      });
    });
  };
  // Delete
  handleDelete(id : number) {
    let product : IProduct ;
    this.productService.getById(id).subscribe((next) => {
      product = next ;
      const dialogRef = this.dialog.open(ConfirmDeleteComponent, {
        width : '300px' ,
        data: { product : product}
      });
      dialogRef.afterClosed().subscribe(result =>  {
        if(result) {
          this.productService.deleteProduct(id).subscribe((next) => {
            this.ngOnInit();
          })
        };
      });
    });
  }
  //View
 handleView(id : number) {
        this.productService.getById(id).subscribe((data: IProduct) => {
          this.product = data;
          const dialogRef = this.dialog.open(ProductDetailComponent, {
            width : '350px' ,
            height : 'auto',
            data: { product : this.product },
            panelClass : 'view'
          });
           dialogRef.afterClosed().subscribe(result => {
            console.log(`Dialog result: ${result}`);
          })
        })
      }
}
