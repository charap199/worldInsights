import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaxGdpTable } from './max-gdp-table';

describe('MaxGdpTable', () => {
  let component: MaxGdpTable;
  let fixture: ComponentFixture<MaxGdpTable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MaxGdpTable]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MaxGdpTable);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
