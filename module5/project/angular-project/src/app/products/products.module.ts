import { MatButtonModule } from '@angular/material/button';
import { ChangeIdPipe } from './../pipes/id-pipe';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductsRoutingModule } from './products-routing.module';
import { ProductsComponent } from './products.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { MatDialogModule } from '@angular/material/dialog';
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
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    MatDialogModule,
    MatButtonModule
  ]
})
export class ProductsModule { }
