# ModForumPrepareDraftAreaForPost200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areaoptions** | [**[]ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner**](ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner.md) |  | 
**Draftitemid** | **int32** | Draft item id for the file area. | [default to null]
**Files** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Messagetext** | **string** | Message text with URLs rewritten. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumPrepareDraftAreaForPost200Response

`func NewModForumPrepareDraftAreaForPost200Response(areaoptions []ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner, draftitemid int32, messagetext string, ) *ModForumPrepareDraftAreaForPost200Response`

NewModForumPrepareDraftAreaForPost200Response instantiates a new ModForumPrepareDraftAreaForPost200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumPrepareDraftAreaForPost200ResponseWithDefaults

`func NewModForumPrepareDraftAreaForPost200ResponseWithDefaults() *ModForumPrepareDraftAreaForPost200Response`

NewModForumPrepareDraftAreaForPost200ResponseWithDefaults instantiates a new ModForumPrepareDraftAreaForPost200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaoptions

`func (o *ModForumPrepareDraftAreaForPost200Response) GetAreaoptions() []ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner`

GetAreaoptions returns the Areaoptions field if non-nil, zero value otherwise.

### GetAreaoptionsOk

`func (o *ModForumPrepareDraftAreaForPost200Response) GetAreaoptionsOk() (*[]ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner, bool)`

GetAreaoptionsOk returns a tuple with the Areaoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaoptions

`func (o *ModForumPrepareDraftAreaForPost200Response) SetAreaoptions(v []ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner)`

SetAreaoptions sets Areaoptions field to given value.


### GetDraftitemid

`func (o *ModForumPrepareDraftAreaForPost200Response) GetDraftitemid() int32`

GetDraftitemid returns the Draftitemid field if non-nil, zero value otherwise.

### GetDraftitemidOk

`func (o *ModForumPrepareDraftAreaForPost200Response) GetDraftitemidOk() (*int32, bool)`

GetDraftitemidOk returns a tuple with the Draftitemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftitemid

`func (o *ModForumPrepareDraftAreaForPost200Response) SetDraftitemid(v int32)`

SetDraftitemid sets Draftitemid field to given value.


### GetFiles

`func (o *ModForumPrepareDraftAreaForPost200Response) GetFiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ModForumPrepareDraftAreaForPost200Response) GetFilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ModForumPrepareDraftAreaForPost200Response) SetFiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetFiles sets Files field to given value.

### HasFiles

`func (o *ModForumPrepareDraftAreaForPost200Response) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetMessagetext

`func (o *ModForumPrepareDraftAreaForPost200Response) GetMessagetext() string`

GetMessagetext returns the Messagetext field if non-nil, zero value otherwise.

### GetMessagetextOk

`func (o *ModForumPrepareDraftAreaForPost200Response) GetMessagetextOk() (*string, bool)`

GetMessagetextOk returns a tuple with the Messagetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagetext

`func (o *ModForumPrepareDraftAreaForPost200Response) SetMessagetext(v string)`

SetMessagetext sets Messagetext field to given value.


### GetWarnings

`func (o *ModForumPrepareDraftAreaForPost200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumPrepareDraftAreaForPost200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumPrepareDraftAreaForPost200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumPrepareDraftAreaForPost200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


