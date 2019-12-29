import { TestBed } from '@angular/core/testing';

import { FuntionalService } from './funtional.service';

describe('FuntionalService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FuntionalService = TestBed.get(FuntionalService);
    expect(service).toBeTruthy();
  });
});
