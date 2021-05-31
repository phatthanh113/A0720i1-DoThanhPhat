import { Injectable } from '@angular/core';
import { AbstractControl } from '@angular/forms';
import * as moment from 'moment';

@Injectable({
  providedIn: 'root'
})
export class ValidateService {

  public validationMessage_products = {

    'name': [
      {type: 'required', message: 'Name is required'},
    ],
    'price': [
      {type: 'required', message: 'Price is required'},
    ],
    'start_date': [
      {type: 'pattern', message: 'Ngày không đúng định dạng dd/MM/yyyy'},
      {type: 'invalid', message: 'Ngày không hợp lệ'}
    ],
    'end_date': [
      {type: 'required', message: 'Ngày không để trống'},
      {type: 'pattern', message: 'Ngày không đúng định dạng dd/MM/yyyy'},
      {type: 'invalid', message: 'Ngày không hợp lệ'}
    ],
  };
  validateDate(formControl: AbstractControl) {
    const inputDate = formControl.value;
    if (moment(inputDate, 'dd/MM/yyyy').isValid()) {
      return null;
    }
    return {invalid: true};
  }
  checkPeriod(formControl: AbstractControl) {
    const period = formControl.value;
    const start_Date = moment(period.startDate, 'DD/MM/YYYY').toDate();
    const end_Date = moment(period.endDate, 'DD/MM/YYYY').toDate();
    if (start_Date < end_Date) {
      return null;
    } else {
      return {period: true};
    }
  }
}


