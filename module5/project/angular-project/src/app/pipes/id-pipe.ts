import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'changeId'})
export class ChangeIdPipe implements PipeTransform {
  transform(value: string,before : string): string {
    let newStr: string = `${before}-`+('000' + value).slice(-4);
    return newStr;
  }
}
