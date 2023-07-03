import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SildelbarCustomerComponent } from './sildelbar-customer.component';

describe('SildelbarCustomerComponent', () => {
  let component: SildelbarCustomerComponent;
  let fixture: ComponentFixture<SildelbarCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SildelbarCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SildelbarCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
