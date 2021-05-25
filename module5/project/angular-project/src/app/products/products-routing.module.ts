import { UpdateProductComponent } from './update-product/update-product.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './product-list/product-list.component';

import { ProductsComponent } from './products.component';

const routes: Routes = [
  { path: '', component: ProductListComponent },
  { path: 'create', component: CreateProductComponent },
  { path: 'update/:id', component: UpdateProductComponent},
  { path: 'search' , component: ProductListComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
