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
    /// CoreCalendarGetActionEventsByCourses200Response
    /// </summary>
    [DataContract(Name = "core_calendar_get_action_events_by_courses_200_response")]
    public partial class CoreCalendarGetActionEventsByCourses200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourses200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetActionEventsByCourses200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourses200Response" /> class.
        /// </summary>
        /// <param name="groupedbycourse">groupedbycourse (required).</param>
        public CoreCalendarGetActionEventsByCourses200Response(List<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner> groupedbycourse = default(List<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner>))
        {
            // to ensure "groupedbycourse" is required (not null)
            if (groupedbycourse == null)
            {
                throw new ArgumentNullException("groupedbycourse is a required property for CoreCalendarGetActionEventsByCourses200Response and cannot be null");
            }
            this.Groupedbycourse = groupedbycourse;
        }

        /// <summary>
        /// Gets or Sets Groupedbycourse
        /// </summary>
        [DataMember(Name = "groupedbycourse", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner> Groupedbycourse { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetActionEventsByCourses200Response {\n");
            sb.Append("  Groupedbycourse: ").Append(Groupedbycourse).Append("\n");
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
