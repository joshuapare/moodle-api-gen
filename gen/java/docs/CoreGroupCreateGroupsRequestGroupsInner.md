

# CoreGroupCreateGroupsRequestGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**courseid** | **Integer** | id of course |  [optional] |
|**customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  |  [optional] |
|**description** | **String** | group description text |  [optional] |
|**descriptionformat** | **Integer** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**enrolmentkey** | **String** | group enrol secret phrase |  [optional] |
|**idnumber** | **String** | id number |  [optional] |
|**name** | **String** | multilang compatible name, course unique |  [optional] |
|**participation** | **Boolean** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true. |  [optional] |
|**visibility** | **Integer** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0 |  [optional] |



