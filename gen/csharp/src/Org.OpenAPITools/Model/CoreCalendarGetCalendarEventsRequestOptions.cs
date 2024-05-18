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
    /// CoreCalendarGetCalendarEventsRequestOptions
    /// </summary>
    [DataContract(Name = "core_calendar_get_calendar_events_request_options")]
    public partial class CoreCalendarGetCalendarEventsRequestOptions : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarEventsRequestOptions" /> class.
        /// </summary>
        /// <param name="ignorehidden">Ignore hidden events or not (default to true).</param>
        /// <param name="siteevents">Set to true to return site events (default to true).</param>
        /// <param name="timeend">Time to which the events should be returned. We treat 0 and null as no end (default to 0).</param>
        /// <param name="timestart">Time from which events should be returned (default to 0).</param>
        /// <param name="userevents">Set to true to return current user&#39;s user events (default to true).</param>
        public CoreCalendarGetCalendarEventsRequestOptions(bool ignorehidden = true, bool siteevents = true, int timeend = 0, int timestart = 0, bool userevents = true)
        {
            this.Ignorehidden = ignorehidden;
            this.Siteevents = siteevents;
            this.Timeend = timeend;
            this.Timestart = timestart;
            this.Userevents = userevents;
        }

        /// <summary>
        /// Ignore hidden events or not
        /// </summary>
        /// <value>Ignore hidden events or not</value>
        [DataMember(Name = "ignorehidden", EmitDefaultValue = true)]
        public bool Ignorehidden { get; set; }

        /// <summary>
        /// Set to true to return site events
        /// </summary>
        /// <value>Set to true to return site events</value>
        [DataMember(Name = "siteevents", EmitDefaultValue = true)]
        public bool Siteevents { get; set; }

        /// <summary>
        /// Time to which the events should be returned. We treat 0 and null as no end
        /// </summary>
        /// <value>Time to which the events should be returned. We treat 0 and null as no end</value>
        [DataMember(Name = "timeend", EmitDefaultValue = false)]
        public int Timeend { get; set; }

        /// <summary>
        /// Time from which events should be returned
        /// </summary>
        /// <value>Time from which events should be returned</value>
        [DataMember(Name = "timestart", EmitDefaultValue = false)]
        public int Timestart { get; set; }

        /// <summary>
        /// Set to true to return current user&#39;s user events
        /// </summary>
        /// <value>Set to true to return current user&#39;s user events</value>
        [DataMember(Name = "userevents", EmitDefaultValue = true)]
        public bool Userevents { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetCalendarEventsRequestOptions {\n");
            sb.Append("  Ignorehidden: ").Append(Ignorehidden).Append("\n");
            sb.Append("  Siteevents: ").Append(Siteevents).Append("\n");
            sb.Append("  Timeend: ").Append(Timeend).Append("\n");
            sb.Append("  Timestart: ").Append(Timestart).Append("\n");
            sb.Append("  Userevents: ").Append(Userevents).Append("\n");
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
