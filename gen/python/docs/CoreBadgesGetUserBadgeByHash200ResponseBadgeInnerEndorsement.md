# CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**badgeid** | **int** | Badge id | 
**claimcomment** | **str** | Claim comment | [default to 'null']
**claimid** | **str** | Claim URL | [default to 'null']
**dateissued** | **int** | Date issued | [default to 0]
**id** | **int** | Endorsement id | [default to null]
**issueremail** | **str** | Endorsement issuer email | [default to 'null']
**issuername** | **str** | Endorsement issuer name | [default to 'null']
**issuerurl** | **str** | Endorsement issuer URL | [default to 'null']

## Example

```python
from openapi_client.models.core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement import CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement from a JSON string
core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement_instance = CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.to_json())

# convert the object into a dict
core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement_dict = core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement_instance.to_dict()
# create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement from a dict
core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement_from_dict = CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.from_dict(core_badges_get_user_badge_by_hash200_response_badge_inner_endorsement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


