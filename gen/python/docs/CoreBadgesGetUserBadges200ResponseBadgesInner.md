# CoreBadgesGetUserBadges200ResponseBadgesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**List[CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner]**](CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.md) |  | [optional] 
**attachment** | **int** | Attachment | [optional] [default to 1]
**badgeurl** | **str** | Badge URL | [optional] 
**courseid** | **int** | Course id | [optional] 
**dateexpire** | **int** | Date expire | [optional] 
**dateissued** | **int** | Date issued | [optional] [default to 0]
**description** | **str** | Badge description | [optional] 
**email** | **str** | User email | [optional] 
**endorsement** | [**CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement**](CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.md) |  | [optional] 
**expiredate** | **int** | Expire date | [optional] 
**expireperiod** | **int** | Expire period | [optional] 
**id** | **int** | Badge id | [optional] 
**imageauthoremail** | **str** | Email of the image author | [optional] 
**imageauthorname** | **str** | Name of the image author | [optional] 
**imageauthorurl** | **str** | URL of the image author | [optional] 
**imagecaption** | **str** | Caption of the image | [optional] 
**issuedid** | **int** | Issued id | [optional] 
**issuercontact** | **str** | Issuer contact | [optional] 
**issuername** | **str** | Issuer name | [optional] 
**issuerurl** | **str** | Issuer URL | [optional] 
**language** | **str** | Language | [optional] 
**message** | **str** | Message | [optional] 
**messagesubject** | **str** | Message subject | [optional] 
**name** | **str** | Badge name | [optional] 
**nextcron** | **int** | Next cron | [optional] 
**notification** | **int** | Whether to notify when badge is awarded | [optional] [default to 1]
**relatedbadges** | [**List[CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner]**](CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner.md) |  | [optional] 
**status** | **int** | Status | [optional] [default to 0]
**timecreated** | **int** | Time created | [optional] [default to 0]
**timemodified** | **int** | Time modified | [optional] [default to 0]
**type** | **int** | Type | [optional] [default to 1]
**uniquehash** | **str** | Unique hash | [optional] 
**usercreated** | **int** | User created | [optional] 
**usermodified** | **int** | User modified | [optional] 
**version** | **str** | Version | [optional] 
**visible** | **int** | Visible | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_badges_get_user_badges200_response_badges_inner import CoreBadgesGetUserBadges200ResponseBadgesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadges200ResponseBadgesInner from a JSON string
core_badges_get_user_badges200_response_badges_inner_instance = CoreBadgesGetUserBadges200ResponseBadgesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadges200ResponseBadgesInner.to_json())

# convert the object into a dict
core_badges_get_user_badges200_response_badges_inner_dict = core_badges_get_user_badges200_response_badges_inner_instance.to_dict()
# create an instance of CoreBadgesGetUserBadges200ResponseBadgesInner from a dict
core_badges_get_user_badges200_response_badges_inner_from_dict = CoreBadgesGetUserBadges200ResponseBadgesInner.from_dict(core_badges_get_user_badges200_response_badges_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


