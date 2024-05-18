# CoreUserAgreeSitePolicy200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Status: true only if we set the policyagreed to 1 for the user | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_user_agree_site_policy200_response import CoreUserAgreeSitePolicy200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserAgreeSitePolicy200Response from a JSON string
core_user_agree_site_policy200_response_instance = CoreUserAgreeSitePolicy200Response.from_json(json)
# print the JSON string representation of the object
print(CoreUserAgreeSitePolicy200Response.to_json())

# convert the object into a dict
core_user_agree_site_policy200_response_dict = core_user_agree_site_policy200_response_instance.to_dict()
# create an instance of CoreUserAgreeSitePolicy200Response from a dict
core_user_agree_site_policy200_response_from_dict = CoreUserAgreeSitePolicy200Response.from_dict(core_user_agree_site_policy200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


