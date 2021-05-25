import { ChangeIdPipe } from './../pipes/id-pipe';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductsRoutingModule } from './products-routing.module';
import { ProductsComponent } from './products.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';


@NgModule({
  declarations: [ProductsComponent,
     ProductListComponent,
     CreateProductComponent,
     UpdateProductComponent,
    ChangeIdPipe],
  imports: [
    CommonModule,
    ProductsRoutingModule,
    ReactiveFormsModule,
    FormsModule,
  ]
})
export class ProductsModule { }
