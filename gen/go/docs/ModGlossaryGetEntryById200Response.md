# ModGlossaryGetEntryById200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entry** | [**ModGlossaryGetEntryById200ResponseEntry**](ModGlossaryGetEntryById200ResponseEntry.md) |  | 
**Permissions** | Pointer to [**ModGlossaryGetEntryById200ResponsePermissions**](ModGlossaryGetEntryById200ResponsePermissions.md) |  | [optional] 
**Ratinginfo** | Pointer to [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryGetEntryById200Response

`func NewModGlossaryGetEntryById200Response(entry ModGlossaryGetEntryById200ResponseEntry, ) *ModGlossaryGetEntryById200Response`

NewModGlossaryGetEntryById200Response instantiates a new ModGlossaryGetEntryById200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntryById200ResponseWithDefaults

`func NewModGlossaryGetEntryById200ResponseWithDefaults() *ModGlossaryGetEntryById200Response`

NewModGlossaryGetEntryById200ResponseWithDefaults instantiates a new ModGlossaryGetEntryById200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntry

`func (o *ModGlossaryGetEntryById200Response) GetEntry() ModGlossaryGetEntryById200ResponseEntry`

GetEntry returns the Entry field if non-nil, zero value otherwise.

### GetEntryOk

`func (o *ModGlossaryGetEntryById200Response) GetEntryOk() (*ModGlossaryGetEntryById200ResponseEntry, bool)`

GetEntryOk returns a tuple with the Entry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntry

`func (o *ModGlossaryGetEntryById200Response) SetEntry(v ModGlossaryGetEntryById200ResponseEntry)`

SetEntry sets Entry field to given value.


### GetPermissions

`func (o *ModGlossaryGetEntryById200Response) GetPermissions() ModGlossaryGetEntryById200ResponsePermissions`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *ModGlossaryGetEntryById200Response) GetPermissionsOk() (*ModGlossaryGetEntryById200ResponsePermissions, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *ModGlossaryGetEntryById200Response) SetPermissions(v ModGlossaryGetEntryById200ResponsePermissions)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *ModGlossaryGetEntryById200Response) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRatinginfo

`func (o *ModGlossaryGetEntryById200Response) GetRatinginfo() ModForumGetDiscussionPosts200ResponseRatinginfo`

GetRatinginfo returns the Ratinginfo field if non-nil, zero value otherwise.

### GetRatinginfoOk

`func (o *ModGlossaryGetEntryById200Response) GetRatinginfoOk() (*ModForumGetDiscussionPosts200ResponseRatinginfo, bool)`

GetRatinginfoOk returns a tuple with the Ratinginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatinginfo

`func (o *ModGlossaryGetEntryById200Response) SetRatinginfo(v ModForumGetDiscussionPosts200ResponseRatinginfo)`

SetRatinginfo sets Ratinginfo field to given value.

### HasRatinginfo

`func (o *ModGlossaryGetEntryById200Response) HasRatinginfo() bool`

HasRatinginfo returns a boolean if a field has been set.

### GetWarnings

`func (o *ModGlossaryGetEntryById200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryGetEntryById200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryGetEntryById200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryGetEntryById200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


