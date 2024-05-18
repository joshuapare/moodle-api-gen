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
    /// ModLessonGetLessonsByCourses200ResponseLessonsInner
    /// </summary>
    [DataContract(Name = "mod_lesson_get_lessons_by_courses_200_response_lessons_inner")]
    public partial class ModLessonGetLessonsByCourses200ResponseLessonsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetLessonsByCourses200ResponseLessonsInner" /> class.
        /// </summary>
        /// <param name="activitylink">Id of the next activity to be linked once the lesson is completed.</param>
        /// <param name="allowofflineattempts">Whether to allow the lesson to be attempted offline in the mobile app.</param>
        /// <param name="available">Available from.</param>
        /// <param name="bgcolor">Slideshow bgcolor.</param>
        /// <param name="completionendreached">Require end reached for completion?.</param>
        /// <param name="completiontimespent">Student must do this activity at least for.</param>
        /// <param name="conditions">Conditions to enable the lesson.</param>
        /// <param name="course">Foreign key reference to the course this lesson is part of..</param>
        /// <param name="coursemodule">Course module id..</param>
        /// <param name="custom">Custom scoring?.</param>
        /// <param name="deadline">Available until.</param>
        /// <param name="dependency">Dependent on (another lesson id).</param>
        /// <param name="displayleft">Display left pages menu?.</param>
        /// <param name="displayleftif">Minimum grade to display menu.</param>
        /// <param name="feedback">Display default feedback.</param>
        /// <param name="grade">The total that the grade is scaled to be out of.</param>
        /// <param name="height">Slideshow height.</param>
        /// <param name="id">Standard Moodle primary key..</param>
        /// <param name="intro">Lesson introduction text..</param>
        /// <param name="introfiles">introfiles.</param>
        /// <param name="introformat">intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 0).</param>
        /// <param name="lang">Forced activity language.</param>
        /// <param name="maxanswers">Maximum answers per page.</param>
        /// <param name="maxattempts">Maximum attempts.</param>
        /// <param name="maxpages">Number of pages to show.</param>
        /// <param name="mediaclose">Display a close button in the popup?.</param>
        /// <param name="mediafile">Local file path or full external URL.</param>
        /// <param name="mediafiles">mediafiles.</param>
        /// <param name="mediaheight">Popup for media file height.</param>
        /// <param name="mediawidth">Popup for media with.</param>
        /// <param name="minquestions">Minimum number of questions.</param>
        /// <param name="modattempts">Allow student review?.</param>
        /// <param name="name">Lesson name..</param>
        /// <param name="nextpagedefault">Action for a correct answer.</param>
        /// <param name="ongoing">Display ongoing score?.</param>
        /// <param name="password">Password.</param>
        /// <param name="practice">Practice lesson?.</param>
        /// <param name="progressbar">Display progress bar?.</param>
        /// <param name="retake">Re-takes allowed.</param>
        /// <param name="review">Provide option to try a question again.</param>
        /// <param name="slideshow">Display lesson as slideshow.</param>
        /// <param name="timelimit">Time limit.</param>
        /// <param name="timemodified">Last time settings were updated.</param>
        /// <param name="usemaxgrade">How to calculate the final grade.</param>
        /// <param name="usepassword">Password protected lesson?.</param>
        /// <param name="width">Slideshow width.</param>
        public ModLessonGetLessonsByCourses200ResponseLessonsInner(int activitylink = default(int), bool allowofflineattempts = default(bool), int available = default(int), string bgcolor = default(string), int completionendreached = default(int), int completiontimespent = default(int), string conditions = default(string), int course = default(int), int coursemodule = default(int), bool custom = default(bool), int deadline = default(int), int dependency = default(int), bool displayleft = default(bool), int displayleftif = default(int), bool feedback = default(bool), int grade = default(int), int height = default(int), int id = default(int), string intro = default(string), List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), int introformat = 0, string lang = default(string), int maxanswers = default(int), int maxattempts = default(int), int maxpages = default(int), int mediaclose = default(int), string mediafile = default(string), List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> mediafiles = default(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>), int mediaheight = default(int), int mediawidth = default(int), int minquestions = default(int), bool modattempts = default(bool), string name = default(string), int nextpagedefault = default(int), bool ongoing = default(bool), string password = default(string), bool practice = default(bool), bool progressbar = default(bool), bool retake = default(bool), bool review = default(bool), bool slideshow = default(bool), int timelimit = default(int), int timemodified = default(int), int usemaxgrade = default(int), bool usepassword = default(bool), int width = default(int))
        {
            this.Activitylink = activitylink;
            this.Allowofflineattempts = allowofflineattempts;
            this.Available = available;
            this.Bgcolor = bgcolor;
            this.Completionendreached = completionendreached;
            this.Completiontimespent = completiontimespent;
            this.Conditions = conditions;
            this.Course = course;
            this.Coursemodule = coursemodule;
            this.Custom = custom;
            this.Deadline = deadline;
            this.Dependency = dependency;
            this.Displayleft = displayleft;
            this.Displayleftif = displayleftif;
            this.Feedback = feedback;
            this.Grade = grade;
            this.Height = height;
            this.Id = id;
            this.Intro = intro;
            this.Introfiles = introfiles;
            this.Introformat = introformat;
            this.Lang = lang;
            this.Maxanswers = maxanswers;
            this.Maxattempts = maxattempts;
            this.Maxpages = maxpages;
            this.Mediaclose = mediaclose;
            this.Mediafile = mediafile;
            this.Mediafiles = mediafiles;
            this.Mediaheight = mediaheight;
            this.Mediawidth = mediawidth;
            this.Minquestions = minquestions;
            this.Modattempts = modattempts;
            this.Name = name;
            this.Nextpagedefault = nextpagedefault;
            this.Ongoing = ongoing;
            this.Password = password;
            this.Practice = practice;
            this.Progressbar = progressbar;
            this.Retake = retake;
            this.Review = review;
            this.Slideshow = slideshow;
            this.Timelimit = timelimit;
            this.Timemodified = timemodified;
            this.Usemaxgrade = usemaxgrade;
            this.Usepassword = usepassword;
            this.Width = width;
        }

        /// <summary>
        /// Id of the next activity to be linked once the lesson is completed
        /// </summary>
        /// <value>Id of the next activity to be linked once the lesson is completed</value>
        [DataMember(Name = "activitylink", EmitDefaultValue = false)]
        public int Activitylink { get; set; }

        /// <summary>
        /// Whether to allow the lesson to be attempted offline in the mobile app
        /// </summary>
        /// <value>Whether to allow the lesson to be attempted offline in the mobile app</value>
        [DataMember(Name = "allowofflineattempts", EmitDefaultValue = true)]
        public bool Allowofflineattempts { get; set; }

        /// <summary>
        /// Available from
        /// </summary>
        /// <value>Available from</value>
        [DataMember(Name = "available", EmitDefaultValue = false)]
        public int Available { get; set; }

        /// <summary>
        /// Slideshow bgcolor
        /// </summary>
        /// <value>Slideshow bgcolor</value>
        [DataMember(Name = "bgcolor", EmitDefaultValue = false)]
        public string Bgcolor { get; set; }

        /// <summary>
        /// Require end reached for completion?
        /// </summary>
        /// <value>Require end reached for completion?</value>
        [DataMember(Name = "completionendreached", EmitDefaultValue = false)]
        public int Completionendreached { get; set; }

        /// <summary>
        /// Student must do this activity at least for
        /// </summary>
        /// <value>Student must do this activity at least for</value>
        [DataMember(Name = "completiontimespent", EmitDefaultValue = false)]
        public int Completiontimespent { get; set; }

        /// <summary>
        /// Conditions to enable the lesson
        /// </summary>
        /// <value>Conditions to enable the lesson</value>
        [DataMember(Name = "conditions", EmitDefaultValue = false)]
        public string Conditions { get; set; }

        /// <summary>
        /// Foreign key reference to the course this lesson is part of.
        /// </summary>
        /// <value>Foreign key reference to the course this lesson is part of.</value>
        [DataMember(Name = "course", EmitDefaultValue = false)]
        public int Course { get; set; }

        /// <summary>
        /// Course module id.
        /// </summary>
        /// <value>Course module id.</value>
        [DataMember(Name = "coursemodule", EmitDefaultValue = false)]
        public int Coursemodule { get; set; }

        /// <summary>
        /// Custom scoring?
        /// </summary>
        /// <value>Custom scoring?</value>
        [DataMember(Name = "custom", EmitDefaultValue = true)]
        public bool Custom { get; set; }

        /// <summary>
        /// Available until
        /// </summary>
        /// <value>Available until</value>
        [DataMember(Name = "deadline", EmitDefaultValue = false)]
        public int Deadline { get; set; }

        /// <summary>
        /// Dependent on (another lesson id)
        /// </summary>
        /// <value>Dependent on (another lesson id)</value>
        [DataMember(Name = "dependency", EmitDefaultValue = false)]
        public int Dependency { get; set; }

        /// <summary>
        /// Display left pages menu?
        /// </summary>
        /// <value>Display left pages menu?</value>
        [DataMember(Name = "displayleft", EmitDefaultValue = true)]
        public bool Displayleft { get; set; }

        /// <summary>
        /// Minimum grade to display menu
        /// </summary>
        /// <value>Minimum grade to display menu</value>
        [DataMember(Name = "displayleftif", EmitDefaultValue = false)]
        public int Displayleftif { get; set; }

        /// <summary>
        /// Display default feedback
        /// </summary>
        /// <value>Display default feedback</value>
        [DataMember(Name = "feedback", EmitDefaultValue = true)]
        public bool Feedback { get; set; }

        /// <summary>
        /// The total that the grade is scaled to be out of
        /// </summary>
        /// <value>The total that the grade is scaled to be out of</value>
        [DataMember(Name = "grade", EmitDefaultValue = false)]
        public int Grade { get; set; }

        /// <summary>
        /// Slideshow height
        /// </summary>
        /// <value>Slideshow height</value>
        [DataMember(Name = "height", EmitDefaultValue = false)]
        public int Height { get; set; }

        /// <summary>
        /// Standard Moodle primary key.
        /// </summary>
        /// <value>Standard Moodle primary key.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Lesson introduction text.
        /// </summary>
        /// <value>Lesson introduction text.</value>
        [DataMember(Name = "intro", EmitDefaultValue = false)]
        public string Intro { get; set; }

        /// <summary>
        /// Gets or Sets Introfiles
        /// </summary>
        [DataMember(Name = "introfiles", EmitDefaultValue = false)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Introfiles { get; set; }

        /// <summary>
        /// intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "introformat", EmitDefaultValue = false)]
        public int Introformat { get; set; }

        /// <summary>
        /// Forced activity language
        /// </summary>
        /// <value>Forced activity language</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// Maximum answers per page
        /// </summary>
        /// <value>Maximum answers per page</value>
        [DataMember(Name = "maxanswers", EmitDefaultValue = false)]
        public int Maxanswers { get; set; }

        /// <summary>
        /// Maximum attempts
        /// </summary>
        /// <value>Maximum attempts</value>
        [DataMember(Name = "maxattempts", EmitDefaultValue = false)]
        public int Maxattempts { get; set; }

        /// <summary>
        /// Number of pages to show
        /// </summary>
        /// <value>Number of pages to show</value>
        [DataMember(Name = "maxpages", EmitDefaultValue = false)]
        public int Maxpages { get; set; }

        /// <summary>
        /// Display a close button in the popup?
        /// </summary>
        /// <value>Display a close button in the popup?</value>
        [DataMember(Name = "mediaclose", EmitDefaultValue = false)]
        public int Mediaclose { get; set; }

        /// <summary>
        /// Local file path or full external URL
        /// </summary>
        /// <value>Local file path or full external URL</value>
        [DataMember(Name = "mediafile", EmitDefaultValue = false)]
        public string Mediafile { get; set; }

        /// <summary>
        /// Gets or Sets Mediafiles
        /// </summary>
        [DataMember(Name = "mediafiles", EmitDefaultValue = false)]
        public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> Mediafiles { get; set; }

        /// <summary>
        /// Popup for media file height
        /// </summary>
        /// <value>Popup for media file height</value>
        [DataMember(Name = "mediaheight", EmitDefaultValue = false)]
        public int Mediaheight { get; set; }

        /// <summary>
        /// Popup for media with
        /// </summary>
        /// <value>Popup for media with</value>
        [DataMember(Name = "mediawidth", EmitDefaultValue = false)]
        public int Mediawidth { get; set; }

        /// <summary>
        /// Minimum number of questions
        /// </summary>
        /// <value>Minimum number of questions</value>
        [DataMember(Name = "minquestions", EmitDefaultValue = false)]
        public int Minquestions { get; set; }

        /// <summary>
        /// Allow student review?
        /// </summary>
        /// <value>Allow student review?</value>
        [DataMember(Name = "modattempts", EmitDefaultValue = true)]
        public bool Modattempts { get; set; }

        /// <summary>
        /// Lesson name.
        /// </summary>
        /// <value>Lesson name.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Action for a correct answer
        /// </summary>
        /// <value>Action for a correct answer</value>
        [DataMember(Name = "nextpagedefault", EmitDefaultValue = false)]
        public int Nextpagedefault { get; set; }

        /// <summary>
        /// Display ongoing score?
        /// </summary>
        /// <value>Display ongoing score?</value>
        [DataMember(Name = "ongoing", EmitDefaultValue = true)]
        public bool Ongoing { get; set; }

        /// <summary>
        /// Password
        /// </summary>
        /// <value>Password</value>
        [DataMember(Name = "password", EmitDefaultValue = false)]
        public string Password { get; set; }

        /// <summary>
        /// Practice lesson?
        /// </summary>
        /// <value>Practice lesson?</value>
        [DataMember(Name = "practice", EmitDefaultValue = true)]
        public bool Practice { get; set; }

        /// <summary>
        /// Display progress bar?
        /// </summary>
        /// <value>Display progress bar?</value>
        [DataMember(Name = "progressbar", EmitDefaultValue = true)]
        public bool Progressbar { get; set; }

        /// <summary>
        /// Re-takes allowed
        /// </summary>
        /// <value>Re-takes allowed</value>
        [DataMember(Name = "retake", EmitDefaultValue = true)]
        public bool Retake { get; set; }

        /// <summary>
        /// Provide option to try a question again
        /// </summary>
        /// <value>Provide option to try a question again</value>
        [DataMember(Name = "review", EmitDefaultValue = true)]
        public bool Review { get; set; }

        /// <summary>
        /// Display lesson as slideshow
        /// </summary>
        /// <value>Display lesson as slideshow</value>
        [DataMember(Name = "slideshow", EmitDefaultValue = true)]
        public bool Slideshow { get; set; }

        /// <summary>
        /// Time limit
        /// </summary>
        /// <value>Time limit</value>
        [DataMember(Name = "timelimit", EmitDefaultValue = false)]
        public int Timelimit { get; set; }

        /// <summary>
        /// Last time settings were updated
        /// </summary>
        /// <value>Last time settings were updated</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// How to calculate the final grade
        /// </summary>
        /// <value>How to calculate the final grade</value>
        [DataMember(Name = "usemaxgrade", EmitDefaultValue = false)]
        public int Usemaxgrade { get; set; }

        /// <summary>
        /// Password protected lesson?
        /// </summary>
        /// <value>Password protected lesson?</value>
        [DataMember(Name = "usepassword", EmitDefaultValue = true)]
        public bool Usepassword { get; set; }

        /// <summary>
        /// Slideshow width
        /// </summary>
        /// <value>Slideshow width</value>
        [DataMember(Name = "width", EmitDefaultValue = false)]
        public int Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetLessonsByCourses200ResponseLessonsInner {\n");
            sb.Append("  Activitylink: ").Append(Activitylink).Append("\n");
            sb.Append("  Allowofflineattempts: ").Append(Allowofflineattempts).Append("\n");
            sb.Append("  Available: ").Append(Available).Append("\n");
            sb.Append("  Bgcolor: ").Append(Bgcolor).Append("\n");
            sb.Append("  Completionendreached: ").Append(Completionendreached).Append("\n");
            sb.Append("  Completiontimespent: ").Append(Completiontimespent).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Coursemodule: ").Append(Coursemodule).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
            sb.Append("  Deadline: ").Append(Deadline).Append("\n");
            sb.Append("  Dependency: ").Append(Dependency).Append("\n");
            sb.Append("  Displayleft: ").Append(Displayleft).Append("\n");
            sb.Append("  Displayleftif: ").Append(Displayleftif).Append("\n");
            sb.Append("  Feedback: ").Append(Feedback).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Intro: ").Append(Intro).Append("\n");
            sb.Append("  Introfiles: ").Append(Introfiles).Append("\n");
            sb.Append("  Introformat: ").Append(Introformat).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Maxanswers: ").Append(Maxanswers).Append("\n");
            sb.Append("  Maxattempts: ").Append(Maxattempts).Append("\n");
            sb.Append("  Maxpages: ").Append(Maxpages).Append("\n");
            sb.Append("  Mediaclose: ").Append(Mediaclose).Append("\n");
            sb.Append("  Mediafile: ").Append(Mediafile).Append("\n");
            sb.Append("  Mediafiles: ").Append(Mediafiles).Append("\n");
            sb.Append("  Mediaheight: ").Append(Mediaheight).Append("\n");
            sb.Append("  Mediawidth: ").Append(Mediawidth).Append("\n");
            sb.Append("  Minquestions: ").Append(Minquestions).Append("\n");
            sb.Append("  Modattempts: ").Append(Modattempts).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Nextpagedefault: ").Append(Nextpagedefault).Append("\n");
            sb.Append("  Ongoing: ").Append(Ongoing).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Practice: ").Append(Practice).Append("\n");
            sb.Append("  Progressbar: ").Append(Progressbar).Append("\n");
            sb.Append("  Retake: ").Append(Retake).Append("\n");
            sb.Append("  Review: ").Append(Review).Append("\n");
            sb.Append("  Slideshow: ").Append(Slideshow).Append("\n");
            sb.Append("  Timelimit: ").Append(Timelimit).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Usemaxgrade: ").Append(Usemaxgrade).Append("\n");
            sb.Append("  Usepassword: ").Append(Usepassword).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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