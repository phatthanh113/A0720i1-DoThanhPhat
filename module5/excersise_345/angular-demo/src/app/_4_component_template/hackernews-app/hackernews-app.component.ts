import { Article } from './article';
import { articleList } from './artileList';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hackernews-app',
  templateUrl: './hackernews-app.component.html',
  styleUrls: ['./hackernews-app.component.css']
})
export class HackernewsAppComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  articles = articleList ;
  // article : Article = {
  //   title : '',
  //   url : ''
  // };
  article : Article ;
  articleForm : Article = {
    title : '',
    url : ''
  } ;
  handleClick() {
    articleList.push(this.articleForm)
    this.articles = articleList;
    this.articleForm = {
      title :'',
      url:''
    }
  }
  handleViewClick(art : Article) {
    this.article = art ;
  }
  changeArticleHandler(art : any){
    for(let article of this.articles) {
      if(art.title === article.title) {
        article = art ;
      }
    }
  }
}
