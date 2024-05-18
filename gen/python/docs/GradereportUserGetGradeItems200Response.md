# GradereportUserGetGradeItems200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usergrades** | [**List[GradereportUserGetGradeItems200ResponseUsergradesInner]**](GradereportUserGetGradeItems200ResponseUsergradesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradereport_user_get_grade_items200_response import GradereportUserGetGradeItems200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradeItems200Response from a JSON string
gradereport_user_get_grade_items200_response_instance = GradereportUserGetGradeItems200Response.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradeItems200Response.to_json())

# convert the object into a dict
gradereport_user_get_grade_items200_response_dict = gradereport_user_get_grade_items200_response_instance.to_dict()
# create an instance of GradereportUserGetGradeItems200Response from a dict
gradereport_user_get_grade_items200_response_from_dict = GradereportUserGetGradeItems200Response.from_dict(gradereport_user_get_grade_items200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


