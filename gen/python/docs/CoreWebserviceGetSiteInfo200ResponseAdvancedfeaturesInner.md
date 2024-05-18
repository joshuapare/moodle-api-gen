# CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner

Advanced features availability

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | feature name | [optional] [default to 'null']
**value** | **int** | feature value. Usually 1 means enabled. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_webservice_get_site_info200_response_advancedfeatures_inner import CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner from a JSON string
core_webservice_get_site_info200_response_advancedfeatures_inner_instance = CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.from_json(json)
# print the JSON string representation of the object
print(CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.to_json())

# convert the object into a dict
core_webservice_get_site_info200_response_advancedfeatures_inner_dict = core_webservice_get_site_info200_response_advancedfeatures_inner_instance.to_dict()
# create an instance of CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner from a dict
core_webservice_get_site_info200_response_advancedfeatures_inner_from_dict = CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.from_dict(core_webservice_get_site_info200_response_advancedfeatures_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


