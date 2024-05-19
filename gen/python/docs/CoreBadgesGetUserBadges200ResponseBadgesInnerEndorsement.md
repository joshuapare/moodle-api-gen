# CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**badgeid** | **int** | Badge id | 
**claimcomment** | **str** | Claim comment | 
**claimid** | **str** | Claim URL | 
**dateissued** | **int** | Date issued | [default to 0]
**id** | **int** | Endorsement id | 
**issueremail** | **str** | Endorsement issuer email | 
**issuername** | **str** | Endorsement issuer name | 
**issuerurl** | **str** | Endorsement issuer URL | 

## Example

```python
from openapi_client.models.core_badges_get_user_badges200_response_badges_inner_endorsement import CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement from a JSON string
core_badges_get_user_badges200_response_badges_inner_endorsement_instance = CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.to_json())

# convert the object into a dict
core_badges_get_user_badges200_response_badges_inner_endorsement_dict = core_badges_get_user_badges200_response_badges_inner_endorsement_instance.to_dict()
# create an instance of CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement from a dict
core_badges_get_user_badges200_response_badges_inner_endorsement_from_dict = CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.from_dict(core_badges_get_user_badges200_response_badges_inner_endorsement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


