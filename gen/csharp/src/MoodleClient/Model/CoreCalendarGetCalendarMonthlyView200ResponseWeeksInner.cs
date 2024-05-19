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
    /// CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner
    /// </summary>
    [DataContract(Name = "core_calendar_get_calendar_monthly_view_200_response_weeks_inner")]
    public partial class CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner" /> class.
        /// </summary>
        /// <param name="days">days.</param>
        /// <param name="postpadding">postpadding.</param>
        /// <param name="prepadding">prepadding.</param>
        public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner> days = default(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner>), List<Object> postpadding = default(List<Object>), List<Object> prepadding = default(List<Object>))
        {
            this.Days = days;
            this.Postpadding = postpadding;
            this.Prepadding = prepadding;
        }

        /// <summary>
        /// Gets or Sets Days
        /// </summary>
        [DataMember(Name = "days", EmitDefaultValue = false)]
        public List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner> Days { get; set; }

        /// <summary>
        /// Gets or Sets Postpadding
        /// </summary>
        [DataMember(Name = "postpadding", EmitDefaultValue = false)]
        public List<Object> Postpadding { get; set; }

        /// <summary>
        /// Gets or Sets Prepadding
        /// </summary>
        [DataMember(Name = "prepadding", EmitDefaultValue = false)]
        public List<Object> Prepadding { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner {\n");
            sb.Append("  Days: ").Append(Days).Append("\n");
            sb.Append("  Postpadding: ").Append(Postpadding).Append("\n");
            sb.Append("  Prepadding: ").Append(Prepadding).Append("\n");
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
