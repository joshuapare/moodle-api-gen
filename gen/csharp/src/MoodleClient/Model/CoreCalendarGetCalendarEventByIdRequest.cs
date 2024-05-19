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
    /// CoreCalendarGetCalendarEventByIdRequest
    /// </summary>
    [DataContract(Name = "core_calendar_get_calendar_event_by_id_request")]
    public partial class CoreCalendarGetCalendarEventByIdRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarEventByIdRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetCalendarEventByIdRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarEventByIdRequest" /> class.
        /// </summary>
        /// <param name="eventid">The event id to be retrieved (required) (default to null).</param>
        public CoreCalendarGetCalendarEventByIdRequest(int eventid = null)
        {
            this.Eventid = eventid;
        }

        /// <summary>
        /// The event id to be retrieved
        /// </summary>
        /// <value>The event id to be retrieved</value>
        [DataMember(Name = "eventid", IsRequired = true, EmitDefaultValue = true)]
        public int Eventid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetCalendarEventByIdRequest {\n");
            sb.Append("  Eventid: ").Append(Eventid).Append("\n");
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
