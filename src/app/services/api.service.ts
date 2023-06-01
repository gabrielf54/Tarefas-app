import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private api: string = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  readData() {
    return this.http.get(this.api + "tasks");
  }
}
