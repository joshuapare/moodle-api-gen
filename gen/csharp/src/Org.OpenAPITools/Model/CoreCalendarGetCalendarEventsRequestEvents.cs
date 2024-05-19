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
    /// CoreCalendarGetCalendarEventsRequestEvents
    /// </summary>
    [DataContract(Name = "core_calendar_get_calendar_events_request_events")]
    public partial class CoreCalendarGetCalendarEventsRequestEvents : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarEventsRequestEvents" /> class.
        /// </summary>
        /// <param name="categoryids">categoryids.</param>
        /// <param name="courseids">courseids.</param>
        /// <param name="eventids">eventids.</param>
        /// <param name="groupids">groupids.</param>
        public CoreCalendarGetCalendarEventsRequestEvents(List<Object> categoryids = default(List<Object>), List<Object> courseids = default(List<Object>), List<Object> eventids = default(List<Object>), List<Object> groupids = default(List<Object>))
        {
            this.Categoryids = categoryids;
            this.Courseids = courseids;
            this.Eventids = eventids;
            this.Groupids = groupids;
        }

        /// <summary>
        /// Gets or Sets Categoryids
        /// </summary>
        [DataMember(Name = "categoryids", EmitDefaultValue = false)]
        public List<Object> Categoryids { get; set; }

        /// <summary>
        /// Gets or Sets Courseids
        /// </summary>
        [DataMember(Name = "courseids", EmitDefaultValue = false)]
        public List<Object> Courseids { get; set; }

        /// <summary>
        /// Gets or Sets Eventids
        /// </summary>
        [DataMember(Name = "eventids", EmitDefaultValue = false)]
        public List<Object> Eventids { get; set; }

        /// <summary>
        /// Gets or Sets Groupids
        /// </summary>
        [DataMember(Name = "groupids", EmitDefaultValue = false)]
        public List<Object> Groupids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetCalendarEventsRequestEvents {\n");
            sb.Append("  Categoryids: ").Append(Categoryids).Append("\n");
            sb.Append("  Courseids: ").Append(Courseids).Append("\n");
            sb.Append("  Eventids: ").Append(Eventids).Append("\n");
            sb.Append("  Groupids: ").Append(Groupids).Append("\n");
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
