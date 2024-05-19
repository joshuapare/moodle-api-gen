/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCalendarGetActionEventsByCourse200ResponseEventsInner
    /// </summary>
    [DataContract(Name = "core_calendar_get_action_events_by_course_200_response_events_inner")]
    public partial class CoreCalendarGetActionEventsByCourse200ResponseEventsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourse200ResponseEventsInner" /> class.
        /// </summary>
        /// <param name="action">action.</param>
        /// <param name="activityname">activityname (default to &quot;null&quot;).</param>
        /// <param name="activitystr">activitystr (default to &quot;null&quot;).</param>
        /// <param name="candelete">candelete (default to null).</param>
        /// <param name="canedit">canedit (default to null).</param>
        /// <param name="category">category.</param>
        /// <param name="categoryid">categoryid (default to null).</param>
        /// <param name="component">component (default to &quot;null&quot;).</param>
        /// <param name="course">course.</param>
        /// <param name="deleteurl">deleteurl (default to &quot;null&quot;).</param>
        /// <param name="description">description (default to &quot;null&quot;).</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="editurl">editurl (default to &quot;null&quot;).</param>
        /// <param name="eventcount">eventcount (default to null).</param>
        /// <param name="eventtype">eventtype (default to &quot;null&quot;).</param>
        /// <param name="formattedlocation">formattedlocation (default to &quot;null&quot;).</param>
        /// <param name="formattedtime">formattedtime (default to &quot;null&quot;).</param>
        /// <param name="groupid">groupid (default to null).</param>
        /// <param name="groupname">groupname (default to &quot;null&quot;).</param>
        /// <param name="icon">icon.</param>
        /// <param name="id">id.</param>
        /// <param name="instance">instance (default to null).</param>
        /// <param name="isactionevent">isactionevent (default to null).</param>
        /// <param name="iscategoryevent">iscategoryevent (default to null).</param>
        /// <param name="iscourseevent">iscourseevent (default to null).</param>
        /// <param name="location">location (default to &quot;null&quot;).</param>
        /// <param name="modulename">modulename (default to &quot;null&quot;).</param>
        /// <param name="name">name.</param>
        /// <param name="normalisedeventtype">normalisedeventtype (default to &quot;null&quot;).</param>
        /// <param name="normalisedeventtypetext">normalisedeventtypetext (default to &quot;null&quot;).</param>
        /// <param name="overdue">overdue (default to false).</param>
        /// <param name="purpose">purpose (default to &quot;null&quot;).</param>
        /// <param name="repeatid">repeatid (default to null).</param>
        /// <param name="subscription">subscription.</param>
        /// <param name="timeduration">timeduration (default to null).</param>
        /// <param name="timemodified">timemodified (default to null).</param>
        /// <param name="timesort">timesort (default to null).</param>
        /// <param name="timestart">timestart (default to null).</param>
        /// <param name="timeusermidnight">timeusermidnight (default to null).</param>
        /// <param name="url">url.</param>
        /// <param name="userid">userid (default to null).</param>
        /// <param name="viewurl">viewurl.</param>
        /// <param name="visible">visible (default to null).</param>
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInner(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction action = default(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction), string activityname = @"null", string activitystr = @"null", bool candelete = null, bool canedit = null, CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory category = default(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory), int categoryid = null, string component = @"null", CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse course = default(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse), string deleteurl = @"null", string description = @"null", int descriptionformat = 1, string editurl = @"null", int eventcount = null, string eventtype = @"null", string formattedlocation = @"null", string formattedtime = @"null", int groupid = null, string groupname = @"null", CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon icon = default(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon), int id = default(int), int instance = null, bool isactionevent = null, bool iscategoryevent = null, bool iscourseevent = null, string location = @"null", string modulename = @"null", string name = default(string), string normalisedeventtype = @"null", string normalisedeventtypetext = @"null", bool overdue = false, string purpose = @"null", int repeatid = null, CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription subscription = default(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription), int timeduration = null, int timemodified = null, int timesort = null, int timestart = null, int timeusermidnight = null, string url = default(string), int userid = null, string viewurl = default(string), int visible = null)
        {
            this.Action = action;
            // use default value if no "activityname" provided
            this.Activityname = activityname ?? @"null";
            // use default value if no "activitystr" provided
            this.Activitystr = activitystr ?? @"null";
            this.Candelete = candelete;
            this.Canedit = canedit;
            this.Category = category;
            this.Categoryid = categoryid;
            // use default value if no "component" provided
            this.Component = component ?? @"null";
            this.Course = course;
            // use default value if no "deleteurl" provided
            this.Deleteurl = deleteurl ?? @"null";
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            this.Descriptionformat = descriptionformat;
            // use default value if no "editurl" provided
            this.Editurl = editurl ?? @"null";
            this.Eventcount = eventcount;
            // use default value if no "eventtype" provided
            this.Eventtype = eventtype ?? @"null";
            // use default value if no "formattedlocation" provided
            this.Formattedlocation = formattedlocation ?? @"null";
            // use default value if no "formattedtime" provided
            this.Formattedtime = formattedtime ?? @"null";
            this.Groupid = groupid;
            // use default value if no "groupname" provided
            this.Groupname = groupname ?? @"null";
            this.Icon = icon;
            this.Id = id;
            this.Instance = instance;
            this.Isactionevent = isactionevent;
            this.Iscategoryevent = iscategoryevent;
            this.Iscourseevent = iscourseevent;
            // use default value if no "location" provided
            this.Location = location ?? @"null";
            // use default value if no "modulename" provided
            this.Modulename = modulename ?? @"null";
            this.Name = name;
            // use default value if no "normalisedeventtype" provided
            this.Normalisedeventtype = normalisedeventtype ?? @"null";
            // use default value if no "normalisedeventtypetext" provided
            this.Normalisedeventtypetext = normalisedeventtypetext ?? @"null";
            this.Overdue = overdue;
            // use default value if no "purpose" provided
            this.Purpose = purpose ?? @"null";
            this.Repeatid = repeatid;
            this.Subscription = subscription;
            this.Timeduration = timeduration;
            this.Timemodified = timemodified;
            this.Timesort = timesort;
            this.Timestart = timestart;
            this.Timeusermidnight = timeusermidnight;
            this.Url = url;
            this.Userid = userid;
            this.Viewurl = viewurl;
            this.Visible = visible;
        }

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name = "action", EmitDefaultValue = false)]
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction Action { get; set; }

        /// <summary>
        /// activityname
        /// </summary>
        /// <value>activityname</value>
        [DataMember(Name = "activityname", EmitDefaultValue = false)]
        public string Activityname { get; set; }

        /// <summary>
        /// activitystr
        /// </summary>
        /// <value>activitystr</value>
        [DataMember(Name = "activitystr", EmitDefaultValue = false)]
        public string Activitystr { get; set; }

        /// <summary>
        /// candelete
        /// </summary>
        /// <value>candelete</value>
        [DataMember(Name = "candelete", EmitDefaultValue = true)]
        public bool Candelete { get; set; }

        /// <summary>
        /// canedit
        /// </summary>
        /// <value>canedit</value>
        [DataMember(Name = "canedit", EmitDefaultValue = true)]
        public bool Canedit { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory Category { get; set; }

        /// <summary>
        /// categoryid
        /// </summary>
        /// <value>categoryid</value>
        [DataMember(Name = "categoryid", EmitDefaultValue = false)]
        public int Categoryid { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// Gets or Sets Course
        /// </summary>
        [DataMember(Name = "course", EmitDefaultValue = false)]
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse Course { get; set; }

        /// <summary>
        /// deleteurl
        /// </summary>
        /// <value>deleteurl</value>
        [DataMember(Name = "deleteurl", EmitDefaultValue = false)]
        public string Deleteurl { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// editurl
        /// </summary>
        /// <value>editurl</value>
        [DataMember(Name = "editurl", EmitDefaultValue = false)]
        public string Editurl { get; set; }

        /// <summary>
        /// eventcount
        /// </summary>
        /// <value>eventcount</value>
        [DataMember(Name = "eventcount", EmitDefaultValue = false)]
        public int Eventcount { get; set; }

        /// <summary>
        /// eventtype
        /// </summary>
        /// <value>eventtype</value>
        [DataMember(Name = "eventtype", EmitDefaultValue = false)]
        public string Eventtype { get; set; }

        /// <summary>
        /// formattedlocation
        /// </summary>
        /// <value>formattedlocation</value>
        [DataMember(Name = "formattedlocation", EmitDefaultValue = false)]
        public string Formattedlocation { get; set; }

        /// <summary>
        /// formattedtime
        /// </summary>
        /// <value>formattedtime</value>
        [DataMember(Name = "formattedtime", EmitDefaultValue = false)]
        public string Formattedtime { get; set; }

        /// <summary>
        /// groupid
        /// </summary>
        /// <value>groupid</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// groupname
        /// </summary>
        /// <value>groupname</value>
        [DataMember(Name = "groupname", EmitDefaultValue = false)]
        public string Groupname { get; set; }

        /// <summary>
        /// Gets or Sets Icon
        /// </summary>
        [DataMember(Name = "icon", EmitDefaultValue = false)]
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon Icon { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// instance
        /// </summary>
        /// <value>instance</value>
        [DataMember(Name = "instance", EmitDefaultValue = false)]
        public int Instance { get; set; }

        /// <summary>
        /// isactionevent
        /// </summary>
        /// <value>isactionevent</value>
        [DataMember(Name = "isactionevent", EmitDefaultValue = true)]
        public bool Isactionevent { get; set; }

        /// <summary>
        /// iscategoryevent
        /// </summary>
        /// <value>iscategoryevent</value>
        [DataMember(Name = "iscategoryevent", EmitDefaultValue = true)]
        public bool Iscategoryevent { get; set; }

        /// <summary>
        /// iscourseevent
        /// </summary>
        /// <value>iscourseevent</value>
        [DataMember(Name = "iscourseevent", EmitDefaultValue = true)]
        public bool Iscourseevent { get; set; }

        /// <summary>
        /// location
        /// </summary>
        /// <value>location</value>
        [DataMember(Name = "location", EmitDefaultValue = false)]
        public string Location { get; set; }

        /// <summary>
        /// modulename
        /// </summary>
        /// <value>modulename</value>
        [DataMember(Name = "modulename", EmitDefaultValue = false)]
        public string Modulename { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// normalisedeventtype
        /// </summary>
        /// <value>normalisedeventtype</value>
        [DataMember(Name = "normalisedeventtype", EmitDefaultValue = false)]
        public string Normalisedeventtype { get; set; }

        /// <summary>
        /// normalisedeventtypetext
        /// </summary>
        /// <value>normalisedeventtypetext</value>
        [DataMember(Name = "normalisedeventtypetext", EmitDefaultValue = false)]
        public string Normalisedeventtypetext { get; set; }

        /// <summary>
        /// overdue
        /// </summary>
        /// <value>overdue</value>
        [DataMember(Name = "overdue", EmitDefaultValue = true)]
        public bool Overdue { get; set; }

        /// <summary>
        /// purpose
        /// </summary>
        /// <value>purpose</value>
        [DataMember(Name = "purpose", EmitDefaultValue = false)]
        public string Purpose { get; set; }

        /// <summary>
        /// repeatid
        /// </summary>
        /// <value>repeatid</value>
        [DataMember(Name = "repeatid", EmitDefaultValue = false)]
        public int Repeatid { get; set; }

        /// <summary>
        /// Gets or Sets Subscription
        /// </summary>
        [DataMember(Name = "subscription", EmitDefaultValue = false)]
        public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription Subscription { get; set; }

        /// <summary>
        /// timeduration
        /// </summary>
        /// <value>timeduration</value>
        [DataMember(Name = "timeduration", EmitDefaultValue = false)]
        public int Timeduration { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// timesort
        /// </summary>
        /// <value>timesort</value>
        [DataMember(Name = "timesort", EmitDefaultValue = false)]
        public int Timesort { get; set; }

        /// <summary>
        /// timestart
        /// </summary>
        /// <value>timestart</value>
        [DataMember(Name = "timestart", EmitDefaultValue = false)]
        public int Timestart { get; set; }

        /// <summary>
        /// timeusermidnight
        /// </summary>
        /// <value>timeusermidnight</value>
        [DataMember(Name = "timeusermidnight", EmitDefaultValue = false)]
        public int Timeusermidnight { get; set; }

        /// <summary>
        /// url
        /// </summary>
        /// <value>url</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// userid
        /// </summary>
        /// <value>userid</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// viewurl
        /// </summary>
        /// <value>viewurl</value>
        [DataMember(Name = "viewurl", EmitDefaultValue = false)]
        public string Viewurl { get; set; }

        /// <summary>
        /// visible
        /// </summary>
        /// <value>visible</value>
        [DataMember(Name = "visible", EmitDefaultValue = false)]
        public int Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetActionEventsByCourse200ResponseEventsInner {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Activityname: ").Append(Activityname).Append("\n");
            sb.Append("  Activitystr: ").Append(Activitystr).Append("\n");
            sb.Append("  Candelete: ").Append(Candelete).Append("\n");
            sb.Append("  Canedit: ").Append(Canedit).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Categoryid: ").Append(Categoryid).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Deleteurl: ").Append(Deleteurl).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Editurl: ").Append(Editurl).Append("\n");
            sb.Append("  Eventcount: ").Append(Eventcount).Append("\n");
            sb.Append("  Eventtype: ").Append(Eventtype).Append("\n");
            sb.Append("  Formattedlocation: ").Append(Formattedlocation).Append("\n");
            sb.Append("  Formattedtime: ").Append(Formattedtime).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Groupname: ").Append(Groupname).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Instance: ").Append(Instance).Append("\n");
            sb.Append("  Isactionevent: ").Append(Isactionevent).Append("\n");
            sb.Append("  Iscategoryevent: ").Append(Iscategoryevent).Append("\n");
            sb.Append("  Iscourseevent: ").Append(Iscourseevent).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Modulename: ").Append(Modulename).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Normalisedeventtype: ").Append(Normalisedeventtype).Append("\n");
            sb.Append("  Normalisedeventtypetext: ").Append(Normalisedeventtypetext).Append("\n");
            sb.Append("  Overdue: ").Append(Overdue).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Repeatid: ").Append(Repeatid).Append("\n");
            sb.Append("  Subscription: ").Append(Subscription).Append("\n");
            sb.Append("  Timeduration: ").Append(Timeduration).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Timesort: ").Append(Timesort).Append("\n");
            sb.Append("  Timestart: ").Append(Timestart).Append("\n");
            sb.Append("  Timeusermidnight: ").Append(Timeusermidnight).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Viewurl: ").Append(Viewurl).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
