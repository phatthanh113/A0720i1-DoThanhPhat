import { IProduct } from './../model/product';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {  throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import {  map } from 'rxjs/operators';
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
  getAllProduct(count = 50) :Observable<IProduct[]> {
    return this.httpClient.get<IProduct[]>(this.apiServer+'/products')
    .pipe(
      map(reponse => reponse.filter((product,i)=> i< count))
    )
  }
  createProduct(product : IProduct) : Observable<IProduct> {
    return this.httpClient.post<IProduct>(`${this.apiServer}/products`,product);
 }

   getById(id : number): Observable<IProduct> {
    return this.httpClient.get<IProduct>(this.apiServer + '/products/' + id);
  }

   updateProduct(product : IProduct): Observable<IProduct> {
    return this.httpClient.patch<IProduct>(`${this.apiServer}/products/${product.id}`,product);
  }
  deleteProduct(id: number) : Observable<IProduct> {
    return this.httpClient.delete<IProduct>(this.apiServer+'/products/'+id);
  }

  
}
