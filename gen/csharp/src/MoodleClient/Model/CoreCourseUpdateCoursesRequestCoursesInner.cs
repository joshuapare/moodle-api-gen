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
    /// CoreCourseUpdateCoursesRequestCoursesInner
    /// </summary>
    [DataContract(Name = "core_course_update_courses_request_courses_inner")]
    public partial class CoreCourseUpdateCoursesRequestCoursesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseUpdateCoursesRequestCoursesInner" /> class.
        /// </summary>
        /// <param name="categoryid">category id.</param>
        /// <param name="completionnotify">1: yes 0: no.</param>
        /// <param name="courseformatoptions">courseformatoptions.</param>
        /// <param name="customfields">customfields.</param>
        /// <param name="defaultgroupingid">default grouping id.</param>
        /// <param name="enablecompletion">Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings..</param>
        /// <param name="enddate">timestamp when the course end.</param>
        /// <param name="forcetheme">name of the force theme.</param>
        /// <param name="format">course format: weeks, topics, social, site,.. (default to &quot;null&quot;).</param>
        /// <param name="fullname">full name.</param>
        /// <param name="groupmode">no group, separate, visible.</param>
        /// <param name="groupmodeforce">1: yes, 0: no.</param>
        /// <param name="hiddensections">(deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students (default to null).</param>
        /// <param name="id">ID of the course.</param>
        /// <param name="idnumber">id number.</param>
        /// <param name="lang">forced course language.</param>
        /// <param name="maxbytes">largest size of file that can be uploaded into the course (default to null).</param>
        /// <param name="newsitems">number of recent items appearing on the course page (default to null).</param>
        /// <param name="numsections">(deprecated, use courseformatoptions) number of weeks/topics.</param>
        /// <param name="shortname">course short name.</param>
        /// <param name="showgrades">1 if grades are shown, otherwise 0.</param>
        /// <param name="showreports">are activity report shown (yes &#x3D; 1, no &#x3D;0) (default to null).</param>
        /// <param name="startdate">timestamp when the course start.</param>
        /// <param name="summary">summary.</param>
        /// <param name="summaryformat">summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="visible">1: available to student, 0:not available.</param>
        public CoreCourseUpdateCoursesRequestCoursesInner(int categoryid = default(int), int completionnotify = default(int), List<CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner> courseformatoptions = default(List<CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner>), List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = default(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>), int defaultgroupingid = default(int), int enablecompletion = default(int), int enddate = default(int), string forcetheme = default(string), string format = @"null", string fullname = default(string), int groupmode = default(int), int groupmodeforce = default(int), int hiddensections = null, int id = default(int), string idnumber = default(string), string lang = default(string), int maxbytes = null, int newsitems = null, int numsections = default(int), string shortname = default(string), int showgrades = default(int), int showreports = null, int startdate = default(int), string summary = default(string), int summaryformat = default(int), int visible = default(int))
        {
            this.Categoryid = categoryid;
            this.Completionnotify = completionnotify;
            this.Courseformatoptions = courseformatoptions;
            this.Customfields = customfields;
            this.Defaultgroupingid = defaultgroupingid;
            this.Enablecompletion = enablecompletion;
            this.Enddate = enddate;
            this.Forcetheme = forcetheme;
            // use default value if no "format" provided
            this.Format = format ?? @"null";
            this.Fullname = fullname;
            this.Groupmode = groupmode;
            this.Groupmodeforce = groupmodeforce;
            this.Hiddensections = hiddensections;
            this.Id = id;
            this.Idnumber = idnumber;
            this.Lang = lang;
            this.Maxbytes = maxbytes;
            this.Newsitems = newsitems;
            this.Numsections = numsections;
            this.Shortname = shortname;
            this.Showgrades = showgrades;
            this.Showreports = showreports;
            this.Startdate = startdate;
            this.Summary = summary;
            this.Summaryformat = summaryformat;
            this.Visible = visible;
        }

        /// <summary>
        /// category id
        /// </summary>
        /// <value>category id</value>
        [DataMember(Name = "categoryid", EmitDefaultValue = false)]
        public int Categoryid { get; set; }

        /// <summary>
        /// 1: yes 0: no
        /// </summary>
        /// <value>1: yes 0: no</value>
        [DataMember(Name = "completionnotify", EmitDefaultValue = false)]
        public int Completionnotify { get; set; }

        /// <summary>
        /// Gets or Sets Courseformatoptions
        /// </summary>
        [DataMember(Name = "courseformatoptions", EmitDefaultValue = false)]
        public List<CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner> Courseformatoptions { get; set; }

        /// <summary>
        /// Gets or Sets Customfields
        /// </summary>
        [DataMember(Name = "customfields", EmitDefaultValue = false)]
        public List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> Customfields { get; set; }

        /// <summary>
        /// default grouping id
        /// </summary>
        /// <value>default grouping id</value>
        [DataMember(Name = "defaultgroupingid", EmitDefaultValue = false)]
        public int Defaultgroupingid { get; set; }

        /// <summary>
        /// Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings.
        /// </summary>
        /// <value>Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings.</value>
        [DataMember(Name = "enablecompletion", EmitDefaultValue = false)]
        public int Enablecompletion { get; set; }

        /// <summary>
        /// timestamp when the course end
        /// </summary>
        /// <value>timestamp when the course end</value>
        [DataMember(Name = "enddate", EmitDefaultValue = false)]
        public int Enddate { get; set; }

        /// <summary>
        /// name of the force theme
        /// </summary>
        /// <value>name of the force theme</value>
        [DataMember(Name = "forcetheme", EmitDefaultValue = false)]
        public string Forcetheme { get; set; }

        /// <summary>
        /// course format: weeks, topics, social, site,..
        /// </summary>
        /// <value>course format: weeks, topics, social, site,..</value>
        [DataMember(Name = "format", EmitDefaultValue = false)]
        public string Format { get; set; }

        /// <summary>
        /// full name
        /// </summary>
        /// <value>full name</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// no group, separate, visible
        /// </summary>
        /// <value>no group, separate, visible</value>
        [DataMember(Name = "groupmode", EmitDefaultValue = false)]
        public int Groupmode { get; set; }

        /// <summary>
        /// 1: yes, 0: no
        /// </summary>
        /// <value>1: yes, 0: no</value>
        [DataMember(Name = "groupmodeforce", EmitDefaultValue = false)]
        public int Groupmodeforce { get; set; }

        /// <summary>
        /// (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students
        /// </summary>
        /// <value>(deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students</value>
        [DataMember(Name = "hiddensections", EmitDefaultValue = false)]
        public int Hiddensections { get; set; }

        /// <summary>
        /// ID of the course
        /// </summary>
        /// <value>ID of the course</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// id number
        /// </summary>
        /// <value>id number</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// forced course language
        /// </summary>
        /// <value>forced course language</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// largest size of file that can be uploaded into the course
        /// </summary>
        /// <value>largest size of file that can be uploaded into the course</value>
        [DataMember(Name = "maxbytes", EmitDefaultValue = false)]
        public int Maxbytes { get; set; }

        /// <summary>
        /// number of recent items appearing on the course page
        /// </summary>
        /// <value>number of recent items appearing on the course page</value>
        [DataMember(Name = "newsitems", EmitDefaultValue = false)]
        public int Newsitems { get; set; }

        /// <summary>
        /// (deprecated, use courseformatoptions) number of weeks/topics
        /// </summary>
        /// <value>(deprecated, use courseformatoptions) number of weeks/topics</value>
        [DataMember(Name = "numsections", EmitDefaultValue = false)]
        public int Numsections { get; set; }

        /// <summary>
        /// course short name
        /// </summary>
        /// <value>course short name</value>
        [DataMember(Name = "shortname", EmitDefaultValue = false)]
        public string Shortname { get; set; }

        /// <summary>
        /// 1 if grades are shown, otherwise 0
        /// </summary>
        /// <value>1 if grades are shown, otherwise 0</value>
        [DataMember(Name = "showgrades", EmitDefaultValue = false)]
        public int Showgrades { get; set; }

        /// <summary>
        /// are activity report shown (yes &#x3D; 1, no &#x3D;0)
        /// </summary>
        /// <value>are activity report shown (yes &#x3D; 1, no &#x3D;0)</value>
        [DataMember(Name = "showreports", EmitDefaultValue = false)]
        public int Showreports { get; set; }

        /// <summary>
        /// timestamp when the course start
        /// </summary>
        /// <value>timestamp when the course start</value>
        [DataMember(Name = "startdate", EmitDefaultValue = false)]
        public int Startdate { get; set; }

        /// <summary>
        /// summary
        /// </summary>
        /// <value>summary</value>
        [DataMember(Name = "summary", EmitDefaultValue = false)]
        public string Summary { get; set; }

        /// <summary>
        /// summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "summaryformat", EmitDefaultValue = false)]
        public int Summaryformat { get; set; }

        /// <summary>
        /// 1: available to student, 0:not available
        /// </summary>
        /// <value>1: available to student, 0:not available</value>
        [DataMember(Name = "visible", EmitDefaultValue = false)]
        public int Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseUpdateCoursesRequestCoursesInner {\n");
            sb.Append("  Categoryid: ").Append(Categoryid).Append("\n");
            sb.Append("  Completionnotify: ").Append(Completionnotify).Append("\n");
            sb.Append("  Courseformatoptions: ").Append(Courseformatoptions).Append("\n");
            sb.Append("  Customfields: ").Append(Customfields).Append("\n");
            sb.Append("  Defaultgroupingid: ").Append(Defaultgroupingid).Append("\n");
            sb.Append("  Enablecompletion: ").Append(Enablecompletion).Append("\n");
            sb.Append("  Enddate: ").Append(Enddate).Append("\n");
            sb.Append("  Forcetheme: ").Append(Forcetheme).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Groupmode: ").Append(Groupmode).Append("\n");
            sb.Append("  Groupmodeforce: ").Append(Groupmodeforce).Append("\n");
            sb.Append("  Hiddensections: ").Append(Hiddensections).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Maxbytes: ").Append(Maxbytes).Append("\n");
            sb.Append("  Newsitems: ").Append(Newsitems).Append("\n");
            sb.Append("  Numsections: ").Append(Numsections).Append("\n");
            sb.Append("  Shortname: ").Append(Shortname).Append("\n");
            sb.Append("  Showgrades: ").Append(Showgrades).Append("\n");
            sb.Append("  Showreports: ").Append(Showreports).Append("\n");
            sb.Append("  Startdate: ").Append(Startdate).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
            sb.Append("  Summaryformat: ").Append(Summaryformat).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
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
