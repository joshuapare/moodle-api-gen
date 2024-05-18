# GradereportSingleviewGetGradeItemsForSearchWidget200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gradeitems** | [**List[GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner]**](GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradereport_singleview_get_grade_items_for_search_widget200_response import GradereportSingleviewGetGradeItemsForSearchWidget200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportSingleviewGetGradeItemsForSearchWidget200Response from a JSON string
gradereport_singleview_get_grade_items_for_search_widget200_response_instance = GradereportSingleviewGetGradeItemsForSearchWidget200Response.from_json(json)
# print the JSON string representation of the object
print(GradereportSingleviewGetGradeItemsForSearchWidget200Response.to_json())

# convert the object into a dict
gradereport_singleview_get_grade_items_for_search_widget200_response_dict = gradereport_singleview_get_grade_items_for_search_widget200_response_instance.to_dict()
# create an instance of GradereportSingleviewGetGradeItemsForSearchWidget200Response from a dict
gradereport_singleview_get_grade_items_for_search_widget200_response_from_dict = GradereportSingleviewGetGradeItemsForSearchWidget200Response.from_dict(gradereport_singleview_get_grade_items_for_search_widget200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


