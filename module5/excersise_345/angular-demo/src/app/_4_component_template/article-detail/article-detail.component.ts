import { Article } from './../hackernews-app/article';
import { Component, OnInit ,Input ,Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-article-detail',
  templateUrl: './article-detail.component.html',
  styleUrls: ['./article-detail.component.css']
})
export class ArticleDetailComponent implements OnInit {
  @Input() article : any ;
  @Output() editArticle:EventEmitter<Article> = new EventEmitter<Article>();
  constructor() { }

  ngOnInit(): void {
  }
  edit(title : any) {
    this.article.title = title.value ;
    this.editArticle.emit(this.article);
  }
}
