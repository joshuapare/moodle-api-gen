# CoreBadgesGetUserBadgeByHash200ResponseBadgeInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**List[CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner]**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner.md) |  | [optional] 
**attachment** | **int** | Attachment | [optional] [default to 1]
**badgeurl** | **str** | Badge URL | [optional] [default to 'null']
**courseid** | **int** | Course id | [optional] [default to null]
**dateexpire** | **int** | Date expire | [optional] [default to null]
**dateissued** | **int** | Date issued | [optional] [default to 0]
**description** | **str** | Badge description | [optional] [default to 'null']
**email** | **str** | User email | [optional] [default to 'null']
**endorsement** | [**CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.md) |  | [optional] 
**expiredate** | **int** | Expire date | [optional] [default to null]
**expireperiod** | **int** | Expire period | [optional] [default to null]
**id** | **int** | Badge id | [optional] 
**imageauthoremail** | **str** | Email of the image author | [optional] [default to 'null']
**imageauthorname** | **str** | Name of the image author | [optional] [default to 'null']
**imageauthorurl** | **str** | URL of the image author | [optional] [default to 'null']
**imagecaption** | **str** | Caption of the image | [optional] [default to 'null']
**issuedid** | **int** | Issued id | [optional] [default to null]
**issuercontact** | **str** | Issuer contact | [optional] [default to 'null']
**issuername** | **str** | Issuer name | [optional] [default to 'null']
**issuerurl** | **str** | Issuer URL | [optional] [default to 'null']
**language** | **str** | Language | [optional] [default to 'null']
**message** | **str** | Message | [optional] [default to 'null']
**messagesubject** | **str** | Message subject | [optional] [default to 'null']
**name** | **str** | Badge name | [optional] [default to 'null']
**nextcron** | **int** | Next cron | [optional] [default to null]
**notification** | **int** | Whether to notify when badge is awarded | [optional] [default to 1]
**relatedbadges** | [**List[CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner]**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.md) |  | [optional] 
**status** | **int** | Status | [optional] [default to 0]
**timecreated** | **int** | Time created | [optional] [default to 0]
**timemodified** | **int** | Time modified | [optional] [default to 0]
**type** | **int** | Type | [optional] [default to 1]
**uniquehash** | **str** | Unique hash | [optional] [default to 'null']
**usercreated** | **int** | User created | [optional] [default to null]
**usermodified** | **int** | User modified | [optional] [default to null]
**version** | **str** | Version | [optional] 
**visible** | **int** | Visible | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_badges_get_user_badge_by_hash200_response_badge_inner import CoreBadgesGetUserBadgeByHash200ResponseBadgeInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInner from a JSON string
core_badges_get_user_badge_by_hash200_response_badge_inner_instance = CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.to_json())

# convert the object into a dict
core_badges_get_user_badge_by_hash200_response_badge_inner_dict = core_badges_get_user_badge_by_hash200_response_badge_inner_instance.to_dict()
# create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInner from a dict
core_badges_get_user_badge_by_hash200_response_badge_inner_from_dict = CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.from_dict(core_badges_get_user_badge_by_hash200_response_badge_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


