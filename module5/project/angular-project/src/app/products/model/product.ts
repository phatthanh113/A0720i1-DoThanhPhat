import { IPeriodTime } from './periodTime';
export interface IProduct {
  id : number;
  name : string ;
  price : number ;
  periodTime? : IPeriodTime;
  color? : string ;
}
