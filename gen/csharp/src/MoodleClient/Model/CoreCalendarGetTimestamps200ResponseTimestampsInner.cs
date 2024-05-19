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
    /// CoreCalendarGetTimestamps200ResponseTimestampsInner
    /// </summary>
    [DataContract(Name = "core_calendar_get_timestamps_200_response_timestamps_inner")]
    public partial class CoreCalendarGetTimestamps200ResponseTimestampsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetTimestamps200ResponseTimestampsInner" /> class.
        /// </summary>
        /// <param name="key">Timestamp key (default to &quot;null&quot;).</param>
        /// <param name="timestamp">Unix timestamp (default to null).</param>
        public CoreCalendarGetTimestamps200ResponseTimestampsInner(string key = @"null", int timestamp = null)
        {
            // use default value if no "key" provided
            this.Key = key ?? @"null";
            this.Timestamp = timestamp;
        }

        /// <summary>
        /// Timestamp key
        /// </summary>
        /// <value>Timestamp key</value>
        [DataMember(Name = "key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// Unix timestamp
        /// </summary>
        /// <value>Unix timestamp</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public int Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetTimestamps200ResponseTimestampsInner {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
