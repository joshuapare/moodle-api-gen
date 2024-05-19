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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCalendarGetCalendarDayView200Response
    /// </summary>
    [DataContract(Name = "core_calendar_get_calendar_day_view_200_response")]
    public partial class CoreCalendarGetCalendarDayView200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarDayView200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetCalendarDayView200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarDayView200Response" /> class.
        /// </summary>
        /// <param name="categoryid">categoryid (default to 0).</param>
        /// <param name="courseid">courseid (required).</param>
        /// <param name="date">date (required).</param>
        /// <param name="defaulteventcontext">defaulteventcontext (required) (default to 0).</param>
        /// <param name="events">events (required).</param>
        /// <param name="filterSelector">filter_selector (required) (default to &quot;null&quot;).</param>
        /// <param name="larrow">larrow (required) (default to &quot;null&quot;).</param>
        /// <param name="neweventtimestamp">neweventtimestamp (required) (default to null).</param>
        /// <param name="nextperiod">nextperiod (required).</param>
        /// <param name="nextperiodlink">nextperiodlink (required) (default to &quot;null&quot;).</param>
        /// <param name="nextperiodname">nextperiodname (required) (default to &quot;null&quot;).</param>
        /// <param name="periodname">periodname (required) (default to &quot;null&quot;).</param>
        /// <param name="previousperiod">previousperiod (required).</param>
        /// <param name="previousperiodlink">previousperiodlink (required) (default to &quot;null&quot;).</param>
        /// <param name="previousperiodname">previousperiodname (required) (default to &quot;null&quot;).</param>
        /// <param name="rarrow">rarrow (required) (default to &quot;null&quot;).</param>
        public CoreCalendarGetCalendarDayView200Response(int categoryid = 0, int courseid = default(int), CoreCalendarGetCalendarDayView200ResponseDate date = default(CoreCalendarGetCalendarDayView200ResponseDate), int defaulteventcontext = 0, List<CoreCalendarGetCalendarDayView200ResponseEventsInner> events = default(List<CoreCalendarGetCalendarDayView200ResponseEventsInner>), string filterSelector = @"null", string larrow = @"null", int neweventtimestamp = null, CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod = default(CoreCalendarGetCalendarDayView200ResponseNextperiod), string nextperiodlink = @"null", string nextperiodname = @"null", string periodname = @"null", CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod = default(CoreCalendarGetCalendarDayView200ResponseNextperiod), string previousperiodlink = @"null", string previousperiodname = @"null", string rarrow = @"null")
        {
            this.Courseid = courseid;
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new ArgumentNullException("date is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Date = date;
            this.Defaulteventcontext = defaulteventcontext;
            // to ensure "events" is required (not null)
            if (events == null)
            {
                throw new ArgumentNullException("events is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Events = events;
            // to ensure "filterSelector" is required (not null)
            if (filterSelector == null)
            {
                throw new ArgumentNullException("filterSelector is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.FilterSelector = filterSelector;
            // to ensure "larrow" is required (not null)
            if (larrow == null)
            {
                throw new ArgumentNullException("larrow is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Larrow = larrow;
            this.Neweventtimestamp = neweventtimestamp;
            // to ensure "nextperiod" is required (not null)
            if (nextperiod == null)
            {
                throw new ArgumentNullException("nextperiod is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Nextperiod = nextperiod;
            // to ensure "nextperiodlink" is required (not null)
            if (nextperiodlink == null)
            {
                throw new ArgumentNullException("nextperiodlink is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Nextperiodlink = nextperiodlink;
            // to ensure "nextperiodname" is required (not null)
            if (nextperiodname == null)
            {
                throw new ArgumentNullException("nextperiodname is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Nextperiodname = nextperiodname;
            // to ensure "periodname" is required (not null)
            if (periodname == null)
            {
                throw new ArgumentNullException("periodname is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Periodname = periodname;
            // to ensure "previousperiod" is required (not null)
            if (previousperiod == null)
            {
                throw new ArgumentNullException("previousperiod is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Previousperiod = previousperiod;
            // to ensure "previousperiodlink" is required (not null)
            if (previousperiodlink == null)
            {
                throw new ArgumentNullException("previousperiodlink is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Previousperiodlink = previousperiodlink;
            // to ensure "previousperiodname" is required (not null)
            if (previousperiodname == null)
            {
                throw new ArgumentNullException("previousperiodname is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Previousperiodname = previousperiodname;
            // to ensure "rarrow" is required (not null)
            if (rarrow == null)
            {
                throw new ArgumentNullException("rarrow is a required property for CoreCalendarGetCalendarDayView200Response and cannot be null");
            }
            this.Rarrow = rarrow;
            this.Categoryid = categoryid;
        }

        /// <summary>
        /// categoryid
        /// </summary>
        /// <value>categoryid</value>
        [DataMember(Name = "categoryid", EmitDefaultValue = false)]
        public int Categoryid { get; set; }

        /// <summary>
        /// courseid
        /// </summary>
        /// <value>courseid</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "date", IsRequired = true, EmitDefaultValue = true)]
        public CoreCalendarGetCalendarDayView200ResponseDate Date { get; set; }

        /// <summary>
        /// defaulteventcontext
        /// </summary>
        /// <value>defaulteventcontext</value>
        [DataMember(Name = "defaulteventcontext", IsRequired = true, EmitDefaultValue = true)]
        public int Defaulteventcontext { get; set; }

        /// <summary>
        /// Gets or Sets Events
        /// </summary>
        [DataMember(Name = "events", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCalendarGetCalendarDayView200ResponseEventsInner> Events { get; set; }

        /// <summary>
        /// filter_selector
        /// </summary>
        /// <value>filter_selector</value>
        [DataMember(Name = "filter_selector", IsRequired = true, EmitDefaultValue = true)]
        public string FilterSelector { get; set; }

        /// <summary>
        /// larrow
        /// </summary>
        /// <value>larrow</value>
        [DataMember(Name = "larrow", IsRequired = true, EmitDefaultValue = true)]
        public string Larrow { get; set; }

        /// <summary>
        /// neweventtimestamp
        /// </summary>
        /// <value>neweventtimestamp</value>
        [DataMember(Name = "neweventtimestamp", IsRequired = true, EmitDefaultValue = true)]
        public int Neweventtimestamp { get; set; }

        /// <summary>
        /// Gets or Sets Nextperiod
        /// </summary>
        [DataMember(Name = "nextperiod", IsRequired = true, EmitDefaultValue = true)]
        public CoreCalendarGetCalendarDayView200ResponseNextperiod Nextperiod { get; set; }

        /// <summary>
        /// nextperiodlink
        /// </summary>
        /// <value>nextperiodlink</value>
        [DataMember(Name = "nextperiodlink", IsRequired = true, EmitDefaultValue = true)]
        public string Nextperiodlink { get; set; }

        /// <summary>
        /// nextperiodname
        /// </summary>
        /// <value>nextperiodname</value>
        [DataMember(Name = "nextperiodname", IsRequired = true, EmitDefaultValue = true)]
        public string Nextperiodname { get; set; }

        /// <summary>
        /// periodname
        /// </summary>
        /// <value>periodname</value>
        [DataMember(Name = "periodname", IsRequired = true, EmitDefaultValue = true)]
        public string Periodname { get; set; }

        /// <summary>
        /// Gets or Sets Previousperiod
        /// </summary>
        [DataMember(Name = "previousperiod", IsRequired = true, EmitDefaultValue = true)]
        public CoreCalendarGetCalendarDayView200ResponseNextperiod Previousperiod { get; set; }

        /// <summary>
        /// previousperiodlink
        /// </summary>
        /// <value>previousperiodlink</value>
        [DataMember(Name = "previousperiodlink", IsRequired = true, EmitDefaultValue = true)]
        public string Previousperiodlink { get; set; }

        /// <summary>
        /// previousperiodname
        /// </summary>
        /// <value>previousperiodname</value>
        [DataMember(Name = "previousperiodname", IsRequired = true, EmitDefaultValue = true)]
        public string Previousperiodname { get; set; }

        /// <summary>
        /// rarrow
        /// </summary>
        /// <value>rarrow</value>
        [DataMember(Name = "rarrow", IsRequired = true, EmitDefaultValue = true)]
        public string Rarrow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetCalendarDayView200Response {\n");
            sb.Append("  Categoryid: ").Append(Categoryid).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Defaulteventcontext: ").Append(Defaulteventcontext).Append("\n");
            sb.Append("  Events: ").Append(Events).Append("\n");
            sb.Append("  FilterSelector: ").Append(FilterSelector).Append("\n");
            sb.Append("  Larrow: ").Append(Larrow).Append("\n");
            sb.Append("  Neweventtimestamp: ").Append(Neweventtimestamp).Append("\n");
            sb.Append("  Nextperiod: ").Append(Nextperiod).Append("\n");
            sb.Append("  Nextperiodlink: ").Append(Nextperiodlink).Append("\n");
            sb.Append("  Nextperiodname: ").Append(Nextperiodname).Append("\n");
            sb.Append("  Periodname: ").Append(Periodname).Append("\n");
            sb.Append("  Previousperiod: ").Append(Previousperiod).Append("\n");
            sb.Append("  Previousperiodlink: ").Append(Previousperiodlink).Append("\n");
            sb.Append("  Previousperiodname: ").Append(Previousperiodname).Append("\n");
            sb.Append("  Rarrow: ").Append(Rarrow).Append("\n");
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