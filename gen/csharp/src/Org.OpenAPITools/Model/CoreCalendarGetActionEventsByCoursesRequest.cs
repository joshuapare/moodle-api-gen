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
    /// CoreCalendarGetActionEventsByCoursesRequest
    /// </summary>
    [DataContract(Name = "core_calendar_get_action_events_by_courses_request")]
    public partial class CoreCalendarGetActionEventsByCoursesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCoursesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetActionEventsByCoursesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCoursesRequest" /> class.
        /// </summary>
        /// <param name="courseids">courseids (required).</param>
        /// <param name="limitnum">Limit number (default to 10).</param>
        /// <param name="searchvalue">The value a user wishes to search against.</param>
        /// <param name="timesortfrom">Time sort from.</param>
        /// <param name="timesortto">Time sort to.</param>
        public CoreCalendarGetActionEventsByCoursesRequest(List<Object> courseids = default(List<Object>), int limitnum = 10, string searchvalue = default(string), int timesortfrom = default(int), int timesortto = default(int))
        {
            // to ensure "courseids" is required (not null)
            if (courseids == null)
            {
                throw new ArgumentNullException("courseids is a required property for CoreCalendarGetActionEventsByCoursesRequest and cannot be null");
            }
            this.Courseids = courseids;
            this.Limitnum = limitnum;
            this.Searchvalue = searchvalue;
            this.Timesortfrom = timesortfrom;
            this.Timesortto = timesortto;
        }

        /// <summary>
        /// Gets or Sets Courseids
        /// </summary>
        [DataMember(Name = "courseids", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Courseids { get; set; }

        /// <summary>
        /// Limit number
        /// </summary>
        /// <value>Limit number</value>
        [DataMember(Name = "limitnum", EmitDefaultValue = false)]
        public int Limitnum { get; set; }

        /// <summary>
        /// The value a user wishes to search against
        /// </summary>
        /// <value>The value a user wishes to search against</value>
        [DataMember(Name = "searchvalue", EmitDefaultValue = false)]
        public string Searchvalue { get; set; }

        /// <summary>
        /// Time sort from
        /// </summary>
        /// <value>Time sort from</value>
        [DataMember(Name = "timesortfrom", EmitDefaultValue = false)]
        public int Timesortfrom { get; set; }

        /// <summary>
        /// Time sort to
        /// </summary>
        /// <value>Time sort to</value>
        [DataMember(Name = "timesortto", EmitDefaultValue = false)]
        public int Timesortto { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetActionEventsByCoursesRequest {\n");
            sb.Append("  Courseids: ").Append(Courseids).Append("\n");
            sb.Append("  Limitnum: ").Append(Limitnum).Append("\n");
            sb.Append("  Searchvalue: ").Append(Searchvalue).Append("\n");
            sb.Append("  Timesortfrom: ").Append(Timesortfrom).Append("\n");
            sb.Append("  Timesortto: ").Append(Timesortto).Append("\n");
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