import { IProduct } from './../model/product';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private products : IProduct[] = [
    {id : 1 , name : 'milk' ,price : 42000},
    {id : 2 , name : 'sugar' ,price : 12000},
    {id : 3 , name : 'salt' ,price : 32000},
 ];
  constructor() {
   }
   getAllProduct() : IProduct[]{
     return this.products;
   }
   createProduct(product : IProduct) : void {
      let length : number = this.products.length ;
      product.id = length <= 0 ? 1 : this.products[length - 1].id + 1 ;
      this.products.push(product);
   }
   getById(id : number) : IProduct {
     const index = this.products.findIndex(x => x.id == id);
     if(index < 0 ) return ;
     else return this.products[index];
   }
   editProduct(product : IProduct) {
     const index = this.products.findIndex(x => x.id == product.id);
     if(index < 0 ) return ;
     else this.products[index] = product ;
   }
   deleteProduct(id : number) {
    const index = this.products.findIndex(x => x.id == id);
    if(index < 0 ) return ;
    else this.products.splice(index,1) ;
   }
   getBySearch(value:any) : IProduct[] {
      return this.products.filter(x => x.name.includes(value));
   }
}
