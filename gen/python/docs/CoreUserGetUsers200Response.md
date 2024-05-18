# CoreUserGetUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[CoreGradesGetGradableUsers200ResponseUsersInner]**](CoreGradesGetGradableUsers200ResponseUsersInner.md) |  | 
**warnings** | [**List[BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner]**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_get_users200_response import CoreUserGetUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserGetUsers200Response from a JSON string
core_user_get_users200_response_instance = CoreUserGetUsers200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserGetUsers200Response.to_json())

# convert the object into a dict
core_user_get_users200_response_dict = core_user_get_users200_response_instance.to_dict()
# create an instance of CoreUserGetUsers200Response from a dict
core_user_get_users200_response_from_dict = CoreUserGetUsers200Response.from_dict(core_user_get_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


