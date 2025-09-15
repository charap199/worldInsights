@RestController
@RequestMapping("/api/stats")
public class CountryStatController {
  private final CountryStatService statService;
  public CountryStatController(CountryStatService s){ this.statService = s; }

  @GetMapping("/max-gdp-per-pop")
  public List<Map<String,Object>> maxGdpPerPop(){
    return statService.maxGdpPerPopulationPerCountry();
  }

  @GetMapping("/filter")
  public List<Map<String,Object>> filter(@RequestParam(required=false) Integer regionId,
                                         @RequestParam(required=false) Integer yearFrom,
                                         @RequestParam(required=false) Integer yearTo,
                                         @RequestParam(defaultValue="0") Integer page,
                                         @RequestParam(defaultValue="50") Integer size){
    return statService.filtered(regionId, yearFrom, yearTo, page, size);
  }


}
