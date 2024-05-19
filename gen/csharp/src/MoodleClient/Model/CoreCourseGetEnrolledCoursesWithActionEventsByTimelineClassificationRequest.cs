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
    /// CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
    /// </summary>
    [DataContract(Name = "core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request")]
    public partial class CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest" /> class.
        /// </summary>
        /// <param name="classification">future, inprogress, or past (required).</param>
        /// <param name="customfieldname">Used when classification &#x3D; customfield.</param>
        /// <param name="customfieldvalue">Used when classification &#x3D; customfield.</param>
        /// <param name="eventsfrom">Optional starting timestamp for action events (default to null).</param>
        /// <param name="eventsto">Optional ending timestamp for action events (default to null).</param>
        /// <param name="limit">Result set limit (default to 0).</param>
        /// <param name="offset">Result set offset (default to 0).</param>
        /// <param name="searchvalue">The value a user wishes to search against.</param>
        /// <param name="sort">Sort string.</param>
        public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(string classification = default(string), string customfieldname = default(string), string customfieldvalue = default(string), int eventsfrom = null, int eventsto = null, int limit = 0, int offset = 0, string searchvalue = default(string), string sort = default(string))
        {
            // to ensure "classification" is required (not null)
            if (classification == null)
            {
                throw new ArgumentNullException("classification is a required property for CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest and cannot be null");
            }
            this.Classification = classification;
            this.Customfieldname = customfieldname;
            this.Customfieldvalue = customfieldvalue;
            this.Eventsfrom = eventsfrom;
            this.Eventsto = eventsto;
            this.Limit = limit;
            this.Offset = offset;
            this.Searchvalue = searchvalue;
            this.Sort = sort;
        }

        /// <summary>
        /// future, inprogress, or past
        /// </summary>
        /// <value>future, inprogress, or past</value>
        [DataMember(Name = "classification", IsRequired = true, EmitDefaultValue = true)]
        public string Classification { get; set; }

        /// <summary>
        /// Used when classification &#x3D; customfield
        /// </summary>
        /// <value>Used when classification &#x3D; customfield</value>
        [DataMember(Name = "customfieldname", EmitDefaultValue = false)]
        public string Customfieldname { get; set; }

        /// <summary>
        /// Used when classification &#x3D; customfield
        /// </summary>
        /// <value>Used when classification &#x3D; customfield</value>
        [DataMember(Name = "customfieldvalue", EmitDefaultValue = false)]
        public string Customfieldvalue { get; set; }

        /// <summary>
        /// Optional starting timestamp for action events
        /// </summary>
        /// <value>Optional starting timestamp for action events</value>
        [DataMember(Name = "eventsfrom", EmitDefaultValue = false)]
        public int Eventsfrom { get; set; }

        /// <summary>
        /// Optional ending timestamp for action events
        /// </summary>
        /// <value>Optional ending timestamp for action events</value>
        [DataMember(Name = "eventsto", EmitDefaultValue = false)]
        public int Eventsto { get; set; }

        /// <summary>
        /// Result set limit
        /// </summary>
        /// <value>Result set limit</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Result set offset
        /// </summary>
        /// <value>Result set offset</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public int Offset { get; set; }

        /// <summary>
        /// The value a user wishes to search against
        /// </summary>
        /// <value>The value a user wishes to search against</value>
        [DataMember(Name = "searchvalue", EmitDefaultValue = false)]
        public string Searchvalue { get; set; }

        /// <summary>
        /// Sort string
        /// </summary>
        /// <value>Sort string</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public string Sort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {\n");
            sb.Append("  Classification: ").Append(Classification).Append("\n");
            sb.Append("  Customfieldname: ").Append(Customfieldname).Append("\n");
            sb.Append("  Customfieldvalue: ").Append(Customfieldvalue).Append("\n");
            sb.Append("  Eventsfrom: ").Append(Eventsfrom).Append("\n");
            sb.Append("  Eventsto: ").Append(Eventsto).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Searchvalue: ").Append(Searchvalue).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
