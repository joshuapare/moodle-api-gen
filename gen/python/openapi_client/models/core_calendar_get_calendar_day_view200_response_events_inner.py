# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_action import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_category import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_course import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_icon import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_subscription import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription
from typing import Optional, Set
from typing_extensions import Self

class CoreCalendarGetCalendarDayView200ResponseEventsInner(BaseModel):
    """
    CoreCalendarGetCalendarDayView200ResponseEventsInner
    """ # noqa: E501
    action: Optional[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction] = None
    activityname: Optional[StrictStr] = Field(default=None, description="activityname")
    activitystr: Optional[StrictStr] = Field(default=None, description="activitystr")
    candelete: Optional[StrictBool] = Field(default=None, description="candelete")
    canedit: Optional[StrictBool] = Field(default=None, description="canedit")
    category: Optional[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory] = None
    categoryid: Optional[StrictInt] = Field(default=None, description="categoryid")
    component: Optional[StrictStr] = Field(default=None, description="component")
    course: Optional[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse] = None
    deleteurl: Optional[StrictStr] = Field(default=None, description="deleteurl")
    description: Optional[StrictStr] = Field(default=None, description="description")
    descriptionformat: Optional[StrictInt] = Field(default=1, description="description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    draggable: Optional[StrictBool] = Field(default=False, description="draggable")
    editurl: Optional[StrictStr] = Field(default=None, description="editurl")
    eventcount: Optional[StrictInt] = Field(default=None, description="eventcount")
    eventtype: Optional[StrictStr] = Field(default=None, description="eventtype")
    formattedlocation: Optional[StrictStr] = Field(default=None, description="formattedlocation")
    formattedtime: Optional[StrictStr] = Field(default=None, description="formattedtime")
    groupid: Optional[StrictInt] = Field(default=None, description="groupid")
    groupname: Optional[StrictStr] = Field(default=None, description="groupname")
    icon: Optional[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon] = None
    id: Optional[StrictInt] = Field(default=None, description="id")
    instance: Optional[StrictInt] = Field(default=None, description="instance")
    isactionevent: Optional[StrictBool] = Field(default=None, description="isactionevent")
    iscategoryevent: Optional[StrictBool] = Field(default=None, description="iscategoryevent")
    iscourseevent: Optional[StrictBool] = Field(default=None, description="iscourseevent")
    islastday: Optional[StrictBool] = Field(default=False, description="islastday")
    location: Optional[StrictStr] = Field(default=None, description="location")
    maxdayerror: Optional[StrictStr] = Field(default='null', description="maxdayerror")
    maxdaytimestamp: Optional[StrictInt] = Field(default=null, description="maxdaytimestamp")
    mindayerror: Optional[StrictStr] = Field(default='null', description="mindayerror")
    mindaytimestamp: Optional[StrictInt] = Field(default=null, description="mindaytimestamp")
    modulename: Optional[StrictStr] = Field(default=None, description="modulename")
    name: Optional[StrictStr] = Field(default=None, description="name")
    normalisedeventtype: Optional[StrictStr] = Field(default=None, description="normalisedeventtype")
    normalisedeventtypetext: Optional[StrictStr] = Field(default=None, description="normalisedeventtypetext")
    overdue: Optional[StrictBool] = Field(default=False, description="overdue")
    popupname: Optional[StrictStr] = Field(default='null', description="popupname")
    purpose: Optional[StrictStr] = Field(default=None, description="purpose")
    repeatid: Optional[StrictInt] = Field(default=None, description="repeatid")
    subscription: Optional[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription] = None
    timeduration: Optional[StrictInt] = Field(default=None, description="timeduration")
    timemodified: Optional[StrictInt] = Field(default=None, description="timemodified")
    timesort: Optional[StrictInt] = Field(default=None, description="timesort")
    timestart: Optional[StrictInt] = Field(default=None, description="timestart")
    timeusermidnight: Optional[StrictInt] = Field(default=None, description="timeusermidnight")
    url: Optional[StrictStr] = Field(default=None, description="url")
    userid: Optional[StrictInt] = Field(default=None, description="userid")
    viewurl: Optional[StrictStr] = Field(default=None, description="viewurl")
    visible: Optional[StrictInt] = Field(default=None, description="visible")
    __properties: ClassVar[List[str]] = ["action", "activityname", "activitystr", "candelete", "canedit", "category", "categoryid", "component", "course", "deleteurl", "description", "descriptionformat", "draggable", "editurl", "eventcount", "eventtype", "formattedlocation", "formattedtime", "groupid", "groupname", "icon", "id", "instance", "isactionevent", "iscategoryevent", "iscourseevent", "islastday", "location", "maxdayerror", "maxdaytimestamp", "mindayerror", "mindaytimestamp", "modulename", "name", "normalisedeventtype", "normalisedeventtypetext", "overdue", "popupname", "purpose", "repeatid", "subscription", "timeduration", "timemodified", "timesort", "timestart", "timeusermidnight", "url", "userid", "viewurl", "visible"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreCalendarGetCalendarDayView200ResponseEventsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of action
        if self.action:
            _dict['action'] = self.action.to_dict()
        # override the default output from pydantic by calling `to_dict()` of category
        if self.category:
            _dict['category'] = self.category.to_dict()
        # override the default output from pydantic by calling `to_dict()` of course
        if self.course:
            _dict['course'] = self.course.to_dict()
        # override the default output from pydantic by calling `to_dict()` of icon
        if self.icon:
            _dict['icon'] = self.icon.to_dict()
        # override the default output from pydantic by calling `to_dict()` of subscription
        if self.subscription:
            _dict['subscription'] = self.subscription.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCalendarGetCalendarDayView200ResponseEventsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action": CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.from_dict(obj["action"]) if obj.get("action") is not None else None,
            "activityname": obj.get("activityname"),
            "activitystr": obj.get("activitystr"),
            "candelete": obj.get("candelete"),
            "canedit": obj.get("canedit"),
            "category": CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.from_dict(obj["category"]) if obj.get("category") is not None else None,
            "categoryid": obj.get("categoryid"),
            "component": obj.get("component"),
            "course": CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.from_dict(obj["course"]) if obj.get("course") is not None else None,
            "deleteurl": obj.get("deleteurl"),
            "description": obj.get("description"),
            "descriptionformat": obj.get("descriptionformat") if obj.get("descriptionformat") is not None else 1,
            "draggable": obj.get("draggable") if obj.get("draggable") is not None else False,
            "editurl": obj.get("editurl"),
            "eventcount": obj.get("eventcount"),
            "eventtype": obj.get("eventtype"),
            "formattedlocation": obj.get("formattedlocation"),
            "formattedtime": obj.get("formattedtime"),
            "groupid": obj.get("groupid"),
            "groupname": obj.get("groupname"),
            "icon": CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.from_dict(obj["icon"]) if obj.get("icon") is not None else None,
            "id": obj.get("id"),
            "instance": obj.get("instance"),
            "isactionevent": obj.get("isactionevent"),
            "iscategoryevent": obj.get("iscategoryevent"),
            "iscourseevent": obj.get("iscourseevent"),
            "islastday": obj.get("islastday") if obj.get("islastday") is not None else False,
            "location": obj.get("location"),
            "maxdayerror": obj.get("maxdayerror") if obj.get("maxdayerror") is not None else 'null',
            "maxdaytimestamp": obj.get("maxdaytimestamp") if obj.get("maxdaytimestamp") is not None else null,
            "mindayerror": obj.get("mindayerror") if obj.get("mindayerror") is not None else 'null',
            "mindaytimestamp": obj.get("mindaytimestamp") if obj.get("mindaytimestamp") is not None else null,
            "modulename": obj.get("modulename"),
            "name": obj.get("name"),
            "normalisedeventtype": obj.get("normalisedeventtype"),
            "normalisedeventtypetext": obj.get("normalisedeventtypetext"),
            "overdue": obj.get("overdue") if obj.get("overdue") is not None else False,
            "popupname": obj.get("popupname") if obj.get("popupname") is not None else 'null',
            "purpose": obj.get("purpose"),
            "repeatid": obj.get("repeatid"),
            "subscription": CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.from_dict(obj["subscription"]) if obj.get("subscription") is not None else None,
            "timeduration": obj.get("timeduration"),
            "timemodified": obj.get("timemodified"),
            "timesort": obj.get("timesort"),
            "timestart": obj.get("timestart"),
            "timeusermidnight": obj.get("timeusermidnight"),
            "url": obj.get("url"),
            "userid": obj.get("userid"),
            "viewurl": obj.get("viewurl"),
            "visible": obj.get("visible")
        })
        return _obj


