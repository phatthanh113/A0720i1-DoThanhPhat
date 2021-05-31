import { MatButtonModule } from '@angular/material/button';
import { ChangeIdPipe } from './../pipes/id-pipe';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatIconModule } from '@angular/material/icon'
import { ProductsRoutingModule } from './products-routing.module';
import { ProductsComponent } from './products.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { MatDialogModule  } from '@angular/material/dialog';
import { ConfirmDeleteComponent } from './confirm-delete/confirm-delete.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input'
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import { MatDaterangepickerModule } from 'mat-daterangepicker';
import { MatMomentDateModule } from '@angular/material-moment-adapter';

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
    MatDaterangepickerModule,
    [MatDialogModule,MatButtonModule,MatFormFieldModule,MatDatepickerModule,MatNativeDateModule,MatMomentDateModule,MatInputModule,MatIconModule]
  ]})
export class ProductsModule { }
