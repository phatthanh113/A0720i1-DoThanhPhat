import { IProduct } from './../model/product';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import {  throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { catchError, map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private readonly apiServer = "http://localhost:3000";
  private products : IProduct[] = [
    {id : 1 , name : 'milk' ,price : 42000},
    {id : 2 , name : 'sugar' ,price : 12000},
    {id : 3 , name : 'salt' ,price : 32000},
 ];
  constructor(private httpClient: HttpClient) {
   }
  //  getAllProduct() : IProduct[]{
  //    return this.products;
  //  }
  getAllProduct(count = 50) :Observable<IProduct[]> {
    return this.httpClient.get<IProduct[]>(this.apiServer+'/products')
    .pipe(
      map(reponse => reponse.filter((product,i)=> i< count))
    )
  }
  createProduct(product : IProduct) : Observable<IProduct> {
    return this.httpClient.post<IProduct>(`${this.apiServer}/products`,product);
 }
  //  createProduct(product : IProduct) : void {
  //     let length : number = this.products.length ;
  //     product.id = length <= 0 ? 1 : this.products[length - 1].id + 10 ;
  //     this.products.push(product);
  //  }
  //  getById(id : number) : IProduct {
  //    const index = this.products.findIndex(x => x.id == id);
  //    if(index < 0 ) return ;
  //    else return this.products[index];
  //  }
   getById(id : number): Observable<IProduct> {
    return this.httpClient.get<IProduct>(this.apiServer + '/products/' + id);
  }

  //  editProduct(product : IProduct) {
  //    const index = this.products.findIndex(x => x.id == product.id);
  //    if(index < 0 ) return ;
  //    else this.products[index] = product ;
  //  }
   updateProduct(product : IProduct): Observable<IProduct> {
    return this.httpClient.patch<IProduct>(`${this.apiServer}/products/${product.id}`,product);
  }
  deleteProduct(id: number) : Observable<IProduct> {
    return this.httpClient.delete<IProduct>(this.apiServer+'/products/'+id);
  }
  //  deleteProduct(id : number) {
  //   const index = this.products.findIndex(x => x.id == id);
  //   if(index < 0 ) return ;
  //   else this.products.splice(index,1) ;
  //  }
   errorHandler(error) {
    let errorMessage = '';
    if(error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
 }
 private listners = new Subject<any>();
 listen() : Observable<any> {
   return this.listners.asObservable();
 }
 filter(){
   this.listners.next();
 }
}
