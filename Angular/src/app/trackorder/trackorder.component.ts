import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trackorder',
  templateUrl: './trackorder.component.html',
  styleUrls: ['./trackorder.component.css']
})
export class TrackorderComponent implements OnInit {
  sales: any = [];
  constructor() { }
  
  ngOnInit(): void {
    fetch(`http://localhost:8080/sales-log`, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
      },
    })
      .then((res) => res.json())
      .then((data) => {
        data = data.filter((item: any) => {
          return item.username == localStorage.getItem('user');
        });
        this.sales = data;
      });
  }
  

  

}
