import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerModule } from './model/customer/customer.module';
import { LoginComponent } from './model/login/login.component';
import { SolicitudModule } from './model/solicitud/solicitud.module';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    CustomerModule,
    SolicitudModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
