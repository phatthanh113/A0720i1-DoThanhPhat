import { HttpClientModule } from '@angular/common/http';
import { SharedModule } from './../shared/shared.module';
import { ChangeIdPipe } from './../pipes/id-pipe';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductsRoutingModule } from './products-routing.module';
import { ProductsComponent } from './products.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';

import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ConfirmDeleteComponent } from './confirm-delete/confirm-delete.component';

@NgModule({
  declarations: [ProductsComponent,
     ProductListComponent,
     CreateProductComponent,
     UpdateProductComponent,
    ChangeIdPipe,
    ProductDetailComponent,
    ConfirmDeleteComponent,
   ],
  imports: [
    CommonModule,
    ProductsRoutingModule,
    SharedModule
  ]
})

export class ProductsModule { }
