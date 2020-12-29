import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustAddComponent } from "./CustAddComponent";

describe('CustAddComponent', () => {
  let component: CustAddComponent;
  let fixture: ComponentFixture<CustAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
