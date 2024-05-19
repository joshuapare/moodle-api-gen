

# ModAssignGetUserFlags200ResponseWarningsInner

warning

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | **String** | item is always &#39;assignment&#39; |  [optional] |
|**itemid** | **Integer** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id |  [optional] |
|**message** | **String** | untranslated english message to explain the warning |  [optional] |
|**warningcode** | **String** | errorcode can be 3 (no user flags found) or 1 (no permission to get user flags) |  [optional] |



