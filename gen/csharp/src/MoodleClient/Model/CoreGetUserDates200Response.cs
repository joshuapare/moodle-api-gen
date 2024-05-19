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
    /// CoreGetUserDates200Response
    /// </summary>
    [DataContract(Name = "core_get_user_dates_200_response")]
    public partial class CoreGetUserDates200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetUserDates200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGetUserDates200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetUserDates200Response" /> class.
        /// </summary>
        /// <param name="dates">dates (required).</param>
        public CoreGetUserDates200Response(List<Object> dates = default(List<Object>))
        {
            // to ensure "dates" is required (not null)
            if (dates == null)
            {
                throw new ArgumentNullException("dates is a required property for CoreGetUserDates200Response and cannot be null");
            }
            this.Dates = dates;
        }

        /// <summary>
        /// Gets or Sets Dates
        /// </summary>
        [DataMember(Name = "dates", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Dates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGetUserDates200Response {\n");
            sb.Append("  Dates: ").Append(Dates).Append("\n");
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
