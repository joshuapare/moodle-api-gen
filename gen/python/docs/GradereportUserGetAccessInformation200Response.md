# GradereportUserGetAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canviewallgrades** | **bool** | Whether the user can view all users grades in the course. | [default to False]
**canviewmygrades** | **bool** | Whether the user can view his grades in the course. | [default to False]
**canviewusergradereport** | **bool** | Whether the user can view the user grade report. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradereport_user_get_access_information200_response import GradereportUserGetAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetAccessInformation200Response from a JSON string
gradereport_user_get_access_information200_response_instance = GradereportUserGetAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetAccessInformation200Response.to_json())

# convert the object into a dict
gradereport_user_get_access_information200_response_dict = gradereport_user_get_access_information200_response_instance.to_dict()
# create an instance of GradereportUserGetAccessInformation200Response from a dict
gradereport_user_get_access_information200_response_from_dict = GradereportUserGetAccessInformation200Response.from_dict(gradereport_user_get_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


